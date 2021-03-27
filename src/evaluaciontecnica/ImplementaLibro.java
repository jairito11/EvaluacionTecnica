/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontecnica;

import java.util.stream.Stream;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author jairo
 */
public class ImplementaLibro implements Libro{
    
    int id;
    String titulo;
    String descripcion;
    int unidadesDisponibles;

    public ImplementaLibro(int id, String titulo, String descripcion, int unidadesDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
    
    @Override
    public String getInformacion() {
        return "\""+ titulo + " (" + descripcion + ") - " + unidadesDisponibles +
                " unidades disponibles. (" + id + ")\"";
    }
    
}
