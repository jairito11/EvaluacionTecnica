/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import evaluaciontecnica.ImplementaBuscar;
import evaluaciontecnica.ImplementaLibro;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;


/**
 *
 * @author jairo
 */
public class TestLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        Libro datos = new ImplementaLibro(152, "El llano en llamas",
                "Compilación de cuentos escritos por juan Rulfo", 150);
        System.out.println(datos.getInformacion());
    }
    
}
