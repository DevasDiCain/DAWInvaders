/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.util.ArrayList;

/**
 *
 * @author peper
 */
public class Bandada {

    static private int FILAS = 4;//Numero de filas de enemigos
    static private int COLUMNAS = 10;//Numero de columnas de enemigos

    static private int VELOCIDAD_HORIZONTAL = 2;//Velocidad de desplazamiento horizontal
    static private int VELOCIDAD_VERTICAL = 4;//Velocidad de desplazamiento vertical
    
    private Direccion sentido;//Clase tipo enum que crearemos más abajo
    private boolean sentidoCambiado;//Correción de la dirección

    private int distHorizontal;//qué espacio por ocupar nos queda
    private int distVertical;

    private int desplHorizontal;//Desplazamiento horizontal y vertical del grupo
    private int desplVertical;

    private int limiteIzquierdo;//Establecemos los límites del mismo
    private int limiteDerecho;
    private int limiteVertical;

    private ArrayList<Enemigo> enemigos;//Será el grupo de enemigos que formarán la banda

    
    
    public void getDisparo(ArrayList<Disparo> disparos) {
        ArrayList<Enemigo> enemigosDisparables = new ArrayList<Enemigo>();
        for (Enemigo e: enemigos) {
            if (e.isDisparable() && e.isActivo()) {
                enemigosDisparables.add(e);
            }
        }
        Enemigo e = enemigosDisparables.get(new Random().nextInt(enemigosDisparables.size()));
        Disparo d = new Disparo(Disparo.Tipo.ENEMIGO);
        d.setPosicion(e.getX() + (e.getAncho()/2) + 4, e.getY() + 4);
        d.activar();
        disparos.add(d);
    }

    private enum Direccion {
        IZQUIERDA, DERECHA
    }
}
