/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciontecnica;

import java.util.ArrayList;
import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author jairo
 */
public class ImplementaBuscar  implements Buscar {

    ArrayList<ImplementaLibro> listaLibros = new ArrayList<ImplementaLibro>();

    @Override
    public List<Libro> buscar(String... strings) throws Exception {
        llenarLista();
        Libro l;
        List<Libro> listaRegresa = new ArrayList<Libro>();
        
        for (int i = 0; i < listaLibros.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (listaLibros.get(i).titulo.contains(strings[j])) {
                    l = listaLibros.get(i);
                    listaRegresa.add(l);
                }
            }
        }
        
        if (listaRegresa.size()==0) {
            throw new LibroNoEncontradoException("LibroNoEncontradoException");
        }

        return listaRegresa;
    }

    public void llenarLista() {
        listaLibros.add(new ImplementaLibro(1, "primer titulo", "primera descripción", 10));
        listaLibros.add(new ImplementaLibro(2, "segundo titulo", "segunda descripción", 10));
        listaLibros.add(new ImplementaLibro(3, "tercer titulo", "tercera descripción", 10));
        listaLibros.add(new ImplementaLibro(4, "cuarto titulo", "cuarta descripción", 10));
        listaLibros.add(new ImplementaLibro(5, "quinto titulo", "quinta descripción", 10));
    }

}
