/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;

/**
 *
 * @author DevasDiCain
 */
public class Juego extends JPanel implements ActionListener {//Aquí vendrá la chicha de nuestro juego
//La clase Juego extienda la pantalla Jpanel e implementa el reconocimiento de acciones

    private Nave nave;//Creamos nuestra nave    
    private Bandada bandada;//Creamos un grupo de enemigos
    private Disparo disparoNave;//Nuestros disparos
    private ArrayList<Disparo> disparosEnemigo;//Lista de disparos enemigos
    private Dificultad dificultad;

    public Juego(Dificultad nivel) {
        dificultad = nivel;
        nave = new Nave();
        bandada = new Bandada();
        disparoNave = new Disparo(Disparo.Tipo.NAVE);
        disparosEnemigo = new ArrayList<Disparo>();

        addKeyListener(new KeyAdapter() {//Añadimos un keylistener (con este método nuestor programa podrá reconocer las teclas pulsadas (A ...D))
            @Override
            public void keyPressed(KeyEvent evento) {
                nave.teclaPulsada(evento);
            }

            @Override
            public void keyReleased(KeyEvent evento) {
                nave.teclaLiberada(evento);
            }
        });

        setFocusable(true);
        setBackground(Color.WHITE);
        setDoubleBuffered(true);//Iniciamos el doble buffer para que la actualización por pantalla sea fluida

        Timer timer = new Timer(15, this);//Comenzamos un contador de 15
        timer.start();//Lo iniciamos

        iniciarJuego();//Iniciamos el juego
    }

    public void iniciarJuego() {
        nave.iniciar();
        bandada.iniciar();
    }

    public void paint(Graphics g) {//Creamos el método que nos dibujará en pantalla los elementos contenidos  en los atributos de nuestro juego (nuestra nave, nuestro disparo, enemigos, disparo de enemigos...)
        super.paint(g);//Hereda de Jpanel

        Graphics2D g2d = (Graphics2D) g;//Instanciamos la clase Graphics2d del paquete atw de java
        g2d.drawImage(nave.getImagen(), nave.getX(), nave.getY(), this);//Dibujamos nuestra nave

        if (disparoNave.estaActivado()) {
            g2d.drawImage(disparoNave.getImagen(), disparoNave.getX(), disparoNave.getY(), this);//Si nuestra nave está disparando dibuja sus disparos
        }

        for (Disparo d : disparosEnemigo) {//Si el enemigos nos dispara , dibujará sus disparos
            d.actualizar();
            g2d.drawImage(d.getImagen(), d.getX(), d.getY(), this);
        }

        for (Enemigo e : bandada.getEnemigos()) {//Dibuja la bandada enemiga
            if (e.isActivo()) {
                g2d.drawImage(e.getImagen(), e.getX(), e.getY(), this);
            }
        }

        Toolkit.getDefaultToolkit().sync();////Sincronizamos el estado de los graficos/ Al ser una clase abstracta no podemos instanciarla
        g.dispose();//Liberamos los recursos del sistema utilizados por el elemento Graphics
    }

    @Override
    public void actionPerformed(ActionEvent ae) {//Controlamos el evento sucedido al pulsar ESPACIO 
        nave.actualizar();
        disparoNave.actualizar();
        for (Disparo d : disparosEnemigo) {
            d.actualizar();
        }
        bandada.actualizar();
        gestionarDisparos(dificultad);
        gestionarColisiones();
        repaint();
    }

    //AQUI CONTROLAREMOS LOS DISPAROS Y LAS COLISIONES GRACIAS A LOS MÉTODOS IMPLEMENTADOS EN LAS CLASES RESPECTIVAS
    private void gestionarColisiones() {//Este método controlará las colisiones, es decir, cuando nuestras balas golpean o somos golpeados por los enemigos
        if (disparoNave.getY() < 0) {//Si el disparo sale de Y entonces lo desactivamos
            disparoNave.desactivar();
        }
        //Daremos "cuerpo" a nuestra bala que avanzará por Y manteniendo su posición en X
        if (disparoNave.estaActivado()) {//Si estámos disparando
            Rectangle r = new Rectangle(disparoNave.getX(), disparoNave.getY(), disparoNave.getAlto(), disparoNave.getAncho());//La clase Rectangle especifica un área en unas cordenadas de espacio (x,y). Podemos definirlo dandole un alto y un ancho y el espacio que ocupa
            if (bandada.comprobarColision(r)) {//Y la bandada enemiga detecta colisión
                disparoNave.desactivar();//la bala desaparecerá
            }
        }

        Iterator<Disparo> i = disparosEnemigo.iterator();//Esto no es más que recorrer varias veces la lista de disparosEnemigos
        while (i.hasNext()) {//Mientras que tengamos un disparo en la lista disparosEnemigos....(hasnext devuelve true si encuentra un elemento en la lista (DISPAROS))
            Disparo d = i.next();//Devuelve el siguiente elemento de la lista (disparosEnemigos), que sería el siguiente disparo
            if (d.getY() > Pantalla.ALTO) {//Si el disparo se sale de Y
                i.remove();//Lo eliminamos
            }
        }

        for (Disparo d : disparosEnemigo) {
            Rectangle r = new Rectangle(d.getX(), d.getY(), d.getAlto(), d.getAncho());//Le asignamos una zona a los disparos enemigos
            if (nave.comprobarColision(r)) {//Comprobamos si le dan a nuestra nave
                this.setVisible(false);

            }
        }
    }

    private void gestionarDisparos(Dificultad nivel) {//Este método controlará los disparos
        if (nave.getDisparando() && !disparoNave.estaActivado()) {//Si nuestra nave no está disparando y disparo de la nave tampoco
            disparoNave.setPosicion(nave.getX() + (nave.getAncho() / 2) - 5, nave.getY() + 2);//El disparo efectuado tomará la posición X de la posición de la nave (X) más la mitad del ancho de la nave y el alto de la nave 
            disparoNave.activar();//Activamos el disparo
            nave.setDisparando(false);//Desactivamos el estado de disparando para cortar el disparo
        }
        switch (nivel) {
            case FACIL:
                if (new Random().nextInt(100) == 2) {//Suceso aleatorio que controlará los disparos enemigos
                    bandada.getDisparo(disparosEnemigo);
                }
                break;
            case MEDIO:
                if (new Random().nextInt(60) == 2) {//Suceso aleatorio que controlará los disparos enemigos
                    bandada.getDisparo(disparosEnemigo);
                }
                break;
            case DIFICIL:
                if (new Random().nextInt(30) == 2) {//Suceso aleatorio que controlará los disparos enemigos
                    bandada.getDisparo(disparosEnemigo);
                }
                break;
            case DAW:
                if (new Random().nextInt(10) == 2) {//Suceso aleatorio que controlará los disparos enemigos
                    bandada.getDisparo(disparosEnemigo);
                }
                break;

            default:
                if (new Random().nextInt(100) == 2) {//Suceso aleatorio que controlará los disparos enemigos
                    bandada.getDisparo(disparosEnemigo);
                }
                break;
        }

    }

}
