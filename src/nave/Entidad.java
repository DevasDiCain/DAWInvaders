/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nave;

import javax.swing.ImageIcon;

/**
 *
 * @author DevasDiCain
 */
public abstract class Entidad {//Esta clase será Padre y abstracta

    protected int x;
    protected int y;

    protected int alto;
    protected int ancho;

    protected int desplazamientoHorizontal;

    protected ImageIcon imagen;

    protected boolean activado;

    protected Entidad() {
        desplazamientoHorizontal = 0;
        activado = false;
    }
}