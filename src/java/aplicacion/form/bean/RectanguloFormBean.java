/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.datos.ColeccionRectangulos;
import aplicacion.modelo.dominio.Auto;
import aplicacion.modelo.dominio.Rectangulo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RectanguloFormBean {
    private ColeccionRectangulos rectangulos;
    private Rectangulo rectangulo;
    private double altura;
    private double superficie;
    private double perimetro;
    private double base;
    private String punto;

    public RectanguloFormBean() {
        rectangulos=new ColeccionRectangulos();
    }

    public void eliminarAuto(){
        getRectangulos().eliminarRectangulo(getRectangulo());
    }
    public void establecerRectangulo(Rectangulo unRectangulo){
        setRectangulo(unRectangulo);
    }

    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    /**
     * @param rectangulo the rectangulo to set
     */
    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
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
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
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
     * @return the punto
     */
    public String getPunto() {
        return punto;
    }

    /**
     * @param punto the punto to set
     */
    public void setPunto(String punto) {
        this.punto = punto;
    }

    /**
     * @return the rectangulos
     */
    public ColeccionRectangulos getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ColeccionRectangulos rectangulos) {
        this.rectangulos = rectangulos;
    }

}
