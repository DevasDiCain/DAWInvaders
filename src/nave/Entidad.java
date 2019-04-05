/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nave;

import java.awt.Image;
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

    protected int desplazamientoHorizontal;//Será en el eje X

    protected ImageIcon imagen;//Nave

    protected boolean activado;

    protected Entidad() {
        desplazamientoHorizontal = 0;
        activado = false;
    }
     protected void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void actualizar() {

    }

    public Image getImagen() {//metodo que nos devolverá la imagen de la nave
        return imagen.getImage();
    }

    protected void setImagen(String rutaImagen) {
        imagen = new ImageIcon(this.getClass().getResource(rutaImagen));
        alto = imagen.getIconHeight();
        ancho = imagen.getIconWidth();
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public boolean disparar() {//Disparos
        return false;
    }

    public boolean estaActivado() {//Comprobar actividad
        return activado;
    }

    public void activar() {//Activar 
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }
}
