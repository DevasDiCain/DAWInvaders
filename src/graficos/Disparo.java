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
    
}
