/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author DevasDiCain
 */
import java.awt.*;
import java.awt.event.KeyEvent;

public class Nave extends Entidad {

    public static int velocidad = 8;//Variable que determinará cuantas casillas avanzaremos (velocidad)...X
    private static final int TECLA_D = 0x00000011;//Asignamos las teclas utilizando val
    private static final int TECLA_A = 0x00001100;

   
    
    private int keys;
    private boolean disparando;

    public Nave() {//Constructor que hereda los atributos de la clase Entidad
        super();
        disparando = false;//Estado de disparar OFF
        keys = 0x00000000;//Establecemos las keys a 0 y tomará el valor de la tecla P u O que será 0x00000011 y 0x00001100
    }

    public void iniciar() {//Mostramos nuestra nave por la pantalla
        setImagen("/recursos/gabriel.png");//Imagen de nuestra nave cambiada por el método implementado en Entidad
        setPosicion(Pantalla.ANCHO / 2 - getAncho() / 2, Pantalla.ALTO - getAlto() * 2);//le damos la posicion en nuestra pantalla que será abajo en el centro
    }

    @Override
    public void actualizar() {//Metodo heredado que actualiza la posición de nuestra nave

        if (keys == 0) desplazamientoHorizontal = 0;
        if (keys == TECLA_D) desplazamientoHorizontal = velocidad;//Si pulsamos P nos movemos a la derecha
        if (keys == TECLA_A) desplazamientoHorizontal = -velocidad;//Si pulsamos O nos movemos a la izquierda

        x += desplazamientoHorizontal;//controlamos el desplazamiento en X

        if (x < 0) {
            x = 0;
        }

        if (x > Pantalla.ANCHO - getAncho()) {//Corregimos la posición para no salirnos de la pantalla
            x = Pantalla.ANCHO - getAncho();
        }
    }
        public void teclaPulsada(KeyEvent evento) {//Con este método controlamos el desplazamiento de nuestra nave al pulsar

        char tecla = evento.getKeyChar();

        if ((tecla == 'a' || tecla == 'A')) {//Podríamos convertirlo a lowcase o upcase pero por rapidez lo hacemos así
            desplazamientoHorizontal = -velocidad;
            keys = keys | TECLA_A;
        }

        if ((tecla == 'd' || tecla == 'D')) {
            desplazamientoHorizontal = velocidad;
            keys = keys | TECLA_D;
        }

        if (evento.getKeyCode() == KeyEvent.VK_SPACE) {//Controlamos el disparo con el ESPACIO
            disparando = true;
        }
    }

    public void teclaLiberada(KeyEvent evento) {//Con este método controlamos el desplazamiento de nuestra nave al soltar

        char tecla = evento.getKeyChar();

        if (tecla == 'a' || tecla == 'A') {
            keys = keys ^ TECLA_A;
        }

        if (tecla == 'd' || tecla == 'D'){
            keys = keys ^ TECLA_D;
        }
    }

    public boolean getDisparando() {
        return disparando;
    }

    public void setDisparando(boolean t) {
        disparando = t;
    }

    public boolean comprobarColision(Rectangle r) {//Nos dirá si la nave colisiona con los bordes o no
        Rectangle rect_nave = new Rectangle(x, y, alto, ancho);
        if (r.intersects(rect_nave)) {
            return true;
        }
        return false;
    }
    
    
    
    


}
