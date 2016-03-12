/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 * Concrete Factory 2
 * @author Yeicol
 */
public class AmarilloFactory implements ITelevisorFactory{

    public AmarilloFactory() {

    }
    
    @Override
    public LCD ConstruirLCD() {
        return new LCD();
    }
    @Override
    public Plasma ConstruirPlasma() {
        return new Plasma();
    }

}
