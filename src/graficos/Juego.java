/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

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

    public Juego() {
        nave = new Nave();
        bandada = new Bandada();
        disparoNave = new Disparo(Disparo.Tipo.NAVE);
        disparosEnemigo = new ArrayList<Disparo>();

        addKeyListener(new KeyAdapter() {//Añadimos un keylistener (con este método nuestor programa podrá reconocer las teclas pulsadas (O ...P))
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}