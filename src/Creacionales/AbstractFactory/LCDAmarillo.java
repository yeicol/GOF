/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 * Producto A1
 * @author Yeicol
 */
class LCDAmarillo extends LCD{


    @Override
    public void producir() {
        System.out.println("Producido " + this.getClass().getSuperclass().getSimpleName() + " de color Amarillo");
    }
    
}
