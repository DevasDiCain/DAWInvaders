/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DevasDiCain
 */
public class Pantalla extends JFrame{

    private javax.swing.JLabel cabezera;
    public static final int ALTO = 540;//Le damos un alto y un ancho a nuestra pantalla
    public static final int ANCHO = 640;
    private static final ImageIcon icono = new ImageIcon(Juego.class.getResource("/recursos/iconoDaw.png"));//Añadimos el icono que queramos
    public Pantalla(Dificultad lvl, String alias, Modo modo)
    {
        Juego x = new Juego(lvl,alias, modo);
        add(x);//Instanciamos la clase Juego
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Habilitamos la salida del programa con la X superior/derecha
        setSize(ANCHO, ALTO);//Le damos el tamaño a nuestra pantalla
        setLocationRelativeTo(null);
        setTitle("DAW Invaders..........By Devas");
        setResizable(false);//Evitamos que puedan maximizarlo o minimizarlo
        setVisible(true);//Lo ponemos visible
        setIconImage(icono.getImage());//Cambiamos el icono de nuestra ventana
        
        
        
        
        
    }


}
