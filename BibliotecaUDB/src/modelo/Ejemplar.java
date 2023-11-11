/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Josue
 */
public abstract class Ejemplar {

    protected String id;
    protected String titulo;
    protected String autor;
    protected String tipo;
    protected String ubicacion;
    protected int cantidad;
    protected int prestados;

    public Ejemplar() {
    }

    public Ejemplar(String id, String titulo, String autor, String tipo, String ubicacion, int cantidad, int prestados) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.cantidad = cantidad;
        this.prestados = prestados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tipo=" + tipo + ", ubicacion=" + ubicacion + ", cantidad=" + cantidad + ", prestados=" + prestados + '}';
    }

  

}
