/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1;

import java.io.PrintWriter;

/**
 *
 * @author Yeicol
 */
public class Main {

    static PrintWriter out = new PrintWriter(System.out);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Institucion uam = Institucion.getInstitucion("Universidad Autónoma de Manizales");
        Institucion utp = Institucion.getInstitucion("Universidad Tecnológica Pereira");

        Alumno madelin = new Alumno(1088260281, "Madelin Rangel Grisales");
        Alumno yeicol = new Alumno(1093220183, "Brian Yeicol Restrepo");
        madelin.setInstitucion(uam);
        yeicol.setInstitucion(utp);

        out.println("\n------------------------------- Caso 1----------------------------------------------");
        out.println("El estudiante " + madelin.getNombre() + " pertence a la institucion " + madelin.getInstitucion().getNombre());
        out.println("El estudiante " + yeicol.getNombre() + " pertence a la institucion " + yeicol.getInstitucion().getNombre());
        out.println("------------------------------- Fin Caso 1----------------------------------------------\n");
        out.close();
    }

}
