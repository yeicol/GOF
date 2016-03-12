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
public interface ITelevisorFactory {

    public LCD ConstruirLCD();

    public Plasma ConstruirPlasma();

}
