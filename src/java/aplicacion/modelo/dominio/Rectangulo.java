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
    private double base;
    private double altura;
    private String PuntoOrigen;
    private double sup;
    private double per;
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, String PuntoOrigen, double sup, double per) {
        this.base = base;
        this.altura = altura;
        this.PuntoOrigen = PuntoOrigen;
        this.sup = sup;
        this.per = per;
    }

   

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the PuntoOrigen
     */
   

    /**
     * @return the sup
     */
    public double getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(double sup) {
        this.sup = sup;
    }

    /**
     * @return the per
     */
    public double getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(double per) {
        this.per = per;
    }

    /**
     * @return the PuntoOrigen
     */
    public String getPuntoOrigen() {
        return PuntoOrigen;
    }

    /**
     * @param PuntoOrigen the PuntoOrigen to set
     */
    public void setPuntoOrigen(String PuntoOrigen) {
        this.PuntoOrigen = PuntoOrigen;
    }
}
    
  
    /**
     * @return the baseRec
     */
   
