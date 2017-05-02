/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import aplicacion.modelo.dominio.Punto;
import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class Rectangulo {
    private double baseRec;
    private double alturaRec;
    private Punto unPuntoOrigen;
    private double supRec;
    private double perRec;
    public Rectangulo() {
    }
    
    public Rectangulo(Punto unPuntoOrigen, Punto unPuntoB, Punto unPuntoC, Punto unPuntoD) {
        this.unPuntoOrigen = unPuntoOrigen;
    }
  
    /**
     * @return the baseRec
     */
    public double getBaseRec() {
        return baseRec;
    }
    public double calcularSup(double base, double altura){
        supRec=(base*altura);
        return supRec;
    }
    public double calcularPer (double base, double altura){
        perRec=(base*2+altura*2);
        return perRec;
    }
    /**
     * @param baseRec the baseRec to set
     */
    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    /**
     * @return the alturaRec
     */
    public double getAlturaRec() {
        return alturaRec;
    }

    /**
     * @param alturaRec the alturaRec to set
     */
    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    /**
     * @return the unPuntoOrigen
     */
    public Punto getUnPuntoOrigen() {
        return unPuntoOrigen;
    }

    /**
     * @param unPuntoOrigen the unPuntoOrigen to set
     */
    public void setUnPuntoOrigen(Punto unPuntoOrigen) {
        this.unPuntoOrigen = unPuntoOrigen;
    }
}
