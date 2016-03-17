/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ComboBasico extends Combo {

	public ComboBasico() {
		descripcion = "Hamburguesa, gaseosa personal";
	}

	@Override
	public int getCosto() {
		return 9000;
	}

}
