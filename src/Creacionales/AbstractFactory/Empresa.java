/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 * Empresa
 *
 * @author Yeicol
 */
public class Empresa {

    private LCD lcd;
    private Plasma plasma;

    public Empresa(TelevisorFactory fabrica) {
        this.lcd = fabrica.ConstruirLCD();
        this.plasma = fabrica.ConstruirPlasma();
    }

    public void formatoLCD() {
        this.lcd.producir();
    }

    public void formatoPlasma() {
        this.plasma.producir();
    }
}
