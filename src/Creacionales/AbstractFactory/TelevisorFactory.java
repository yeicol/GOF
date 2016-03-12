/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 * Abstract Factory
 * @author Yeicol
 */
public interface TelevisorFactory {

    public LCD ConstruirLCD();

    public Plasma ConstruirPlasma();

}
