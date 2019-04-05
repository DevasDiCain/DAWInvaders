/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import javax.swing.JFrame;

/**
 *
 * @author DevasDiCain
 */
public class Pantalla extends JFrame{

    public static final int ALTO = 480;//Le damos un alto y un ancho a nuestra pantalla
    public static final int ANCHO = 640;

    private Pantalla()
    {
        add(new Juego());//Instanciamos la clase Juego
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Habilitamos la salida del programa con la X superior/derecha
        setSize(ANCHO, ALTO);//Le damos el tamaño a nuestra pantalla
        setLocationRelativeTo(null);
        setTitle("Space Invaders..........By Devas");
        setResizable(false);//Evitamos que puedan maximizarlo o minimizarlo
        setVisible(true);//Lo ponemos visible
    }

    public static void main(String[] args)
    {
        new Pantalla();//Ejecutamos el juego
    }
}
