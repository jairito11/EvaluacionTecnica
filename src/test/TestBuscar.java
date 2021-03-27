/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import evaluaciontecnica.ImplementaBuscar;
import java.util.List;
import java.util.Scanner;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author jairo
 */
public class TestBuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuantas palabras clave de titulo vas a ingresar?-Indica un número");
        int numPalabras = leer.nextInt();
        leer.nextLine();
        String palabrasClave[] = new String[numPalabras];
        for (int i = 0; i < numPalabras; i++) {
            System.out.println("Ingresa la palabra número " + (i + 1));
            palabrasClave[i] = leer.nextLine();
        }
        
        Buscar busqueda = new ImplementaBuscar();
        try {
            List<Libro> l = busqueda.buscar(palabrasClave);
            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i).getInformacion());
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error:");
            System.out.println(e.getMessage());
        }

    }

}
