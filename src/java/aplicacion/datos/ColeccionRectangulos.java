/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Rectangulo;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Franco
 */
public class ColeccionRectangulos implements Serializable{
    private ArrayList <Rectangulo> rectangulos;
    private Rectangulo a;
    private Rectangulo b;
    private Rectangulo c;
    private Rectangulo d;
    
    public ColeccionRectangulos() {
        a=new Rectangulo(2,4,"(1;1)",8,12);
        b=new Rectangulo(4,6,"(1;4)",24,20);
        c=new Rectangulo(1,5,"(2;1)",5,12);
        d=new Rectangulo(7,2,"(5;4)",14,18);
        rectangulos=new ArrayList();
        rectangulos.add(a);
        rectangulos.add(b);
        rectangulos.add(c);
        rectangulos.add(d);
    }

    /**
     * @return the rectangulos
     */
    public ArrayList <Rectangulo> getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ArrayList <Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }

    /**
     * @return the a
     */
    public Rectangulo getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Rectangulo a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public Rectangulo getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(Rectangulo b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public Rectangulo getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Rectangulo c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public Rectangulo getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Rectangulo d) {
        this.d = d;
    }
    
    
}
