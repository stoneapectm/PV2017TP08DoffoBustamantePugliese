/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Familia
 */
@ManagedBean
@SessionScoped
public class LibroFormBean {
private Libro libro;
private String titulo;
private String ISNB;
private String autor;
private double precio;
    public LibroFormBean() {
        Libro= new ColeccionLibros();
    }
    public void agregarAuto(){
        auto=new Libro(getTitulo(),getISNB(),getAutor(),getPrecio());
        Libro.agregarLibros(libro);
    }
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ISNB
     */
    public String getISNB() {
        return ISNB;
    }

    /**
     * @param ISNB the ISNB to set
     */
    public void setISNB(String ISNB) {
        this.ISNB = ISNB;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
