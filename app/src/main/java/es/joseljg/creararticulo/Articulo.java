package es.joseljg.creararticulo;

import java.io.Serializable;
import java.util.Objects;

public class Articulo implements Serializable {
    // atributos
    private String nombre;
    private String descripcion;
    private String contenido;

    //constructor
    public Articulo(String nombre, String descripcion, String contenido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenido = contenido;
    }

        // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Articulo)) return false;
        Articulo articulo = (Articulo) o;
        return nombre.equals(articulo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
   //------------------------------------------------------------------
   // tostring
    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
    
}
