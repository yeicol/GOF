/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 *
 * @author Yeicol
 */
public class Main {

    public static void main(String[] args) {

        ITelevisorFactory azul = new AzulFactory();
        Empresa empresa = new Empresa(azul);
        empresa.formatoLCD();

        ITelevisorFactory amarillo = new AmarilloFactory();
        empresa = new Empresa(amarillo);
        empresa.formatoPlasma();

    }
}
