/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso2;

/**
 *
 * @author Yeicol
 */
public class AzulFactory implements ITelevisorFactory{

    public AzulFactory() {

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
