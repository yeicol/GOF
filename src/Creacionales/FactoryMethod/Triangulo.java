/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.FactoryMethod;

/**
 *
 * @author Yeicol
 */
abstract class Triangulo {
    public  Triangulo() {
        crearTriangulo();
    }
    public abstract void crearTriangulo();
}
