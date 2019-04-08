/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author DevasDiCain
 */
public abstract class Entidad {//Esta clase será Padre (de todos los elementos "gráficos" o tangibles de nuestro programa) y abstracta

    protected int x;//Ancho
    protected int y;//Alto

    protected int alto;//Tamaño de nuestra entidad (lo que ocupa)
    protected int ancho;

    protected int desplazamientoHorizontal;//Será en el eje X , será un contador que nos indique cuanto se ha desplazado la entidad por la pantalla

    protected ImageIcon imagen;//Nos permitirá cargar una imagen para nuestros objetos(que serán enemigos y nave)

    protected boolean activado;

    protected Entidad() {
        desplazamientoHorizontal = 0;
        activado = false;
    }
     protected void setPosicion(int x, int y) {//Modificamos su posición
        this.x = x;
        this.y = y;
    }

    public void actualizar() {//Método que actualizará el estado de nuestra entidad

    }

    public Image getImagen() {//metodo que nos devolverá la imagen de nuestra entidad
        return imagen.getImage();
    }

    protected void setImagen(String rutaImagen) {//Este método nos permitirá cambiar la imagen de nuestros enemigos y nave 
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

    public boolean disparar() {
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
