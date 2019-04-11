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
public class Disparo extends Entidad {

    static int VELOCIDAD_NAVE = 4;//Velocidad de mi nave
    static int VELOCIDAD_ENEMIGO = 2;//Velocidad de la nave enemiga

    public enum Tipo {//Disparos propios(del jugador) y disparos de las naves enemigas
        NAVE, ENEMIGO
    }
    private Tipo tipo;//Será el disparo

    public Disparo(Tipo t, Modo modo) {//Constructor del disparo a efectuar según el tipo de disparo que queramos
        super();
        if (t == Tipo.ENEMIGO) {
            setImagen("/recursos/disparo_enemigo.png");//Creamos el disparo de las naves enemigas
        }
        if (t == Tipo.NAVE) {
            setImagen("/recursos/iconoDaw.png");//Creamos el disparo de nuestras naves
        }
        tipo = t;
        x = 0;
        y = 0;
    }
     public void setPosicion(int x, int y) {
        super.setPosicion(x, y);
    }

    public boolean estaActivado() {
        return activado;
    }

    public void activar() {//Métodos que activan/desactivan los disparos
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }

    public void actualizar() {
        if (!activado) {//Si no está activado no hace nada
            return;
        }

        if (tipo == Tipo.NAVE) {//Si es de tipo jugador actualizamos la posición con la velocidad de la nave
            y -= VELOCIDAD_NAVE;
        }

        if (tipo == Tipo.ENEMIGO) {//Si es de tipo nave enemiga actualizamos la posición con la velocidad de la nave enemiga
            y += VELOCIDAD_ENEMIGO;
        }
    }

}
