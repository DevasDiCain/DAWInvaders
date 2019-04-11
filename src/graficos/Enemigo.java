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
public class Enemigo extends Entidad {

    private int fila;//Le damos una posición en el escuadrón
    private int columna;

    private boolean disparable;//Si se le puede dar o no(si tiene un compañero delante no podrá)
    private boolean activo;//Si se muestra o no

    public boolean isDisparable() {
        return disparable;
    }

    public void setDisparable(boolean disparable) {
        this.disparable = disparable;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public enum Tipo {//Creo una clase tipo Enum para crear varios tipos de enemigos, mediante esta clase podremos asignarles una imagen en el constuctor
        TIPO_1, TIPO_2, TIPO_3 , TIPO_VICO
    }

    public Enemigo(Tipo t, int fila, int columna) {//Constructor que hereda de Entidad
        super();

        this.fila = fila;
        this.columna = columna;

        disparable = false;
        activo = true;//Lo mostramos

        if (t == Tipo.TIPO_1) {//Le damos una visualización a cada enemigo dependiendo del tipo que sea
            setImagen("/recursos/eva.png");
        }

        if (t == Tipo.TIPO_2) {
            setImagen("/recursos/vico.png");
        }

        if (t == Tipo.TIPO_3) {
            setImagen("/recursos/pedro.png");
        }
        if (t == Tipo.TIPO_VICO){
            setImagen("/recursos/eva.png");
        }
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
