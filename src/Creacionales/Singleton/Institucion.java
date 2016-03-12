/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.Singleton;


public class Institucion {

    private String nombre;
    private static Institucion instancia;

    public static Institucion getInstitucion(String nombre) {
        if (instancia == null) {
            instancia = new Institucion(nombre);

        }

        return instancia;
    }
    
    private Institucion(String nombre) {
        this.setNombre(nombre);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
