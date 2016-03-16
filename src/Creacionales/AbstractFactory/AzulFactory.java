/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 * Concrete Factory 1
 * @author Yeicol
 */
public class AzulFactory implements TelevisorFactory{

    public AzulFactory() {

    }
    @Override
    public LCD ConstruirLCD() {
        return new LCDAzul();
    }

    @Override
    public Plasma ConstruirPlasma() {
        return new PlasmaAzul();
    }



}
