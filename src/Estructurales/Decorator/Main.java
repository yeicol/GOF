/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructurales.Decorator;

/**
 *
 * @author Administrador
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Combo basico = new ComboBasico();
		Combo familiar = new ComboFamiliar();
		Combo especial = new ComboEspecial();
		
		mostrarPedido(basico);
		mostrarPedido(familiar);
		mostrarPedido(especial);
		
		basico = new Carne(basico);
		mostrarPedido(basico);
		
		basico = new Queso(basico);
		mostrarPedido(basico);
		
		basico = new Tomate(basico);
		mostrarPedido(basico);
		
		basico = new Papa(basico);
		mostrarPedido(basico);
	}

	public static void mostrarPedido(Combo combo) {
		System.out.println("Descripción del pedido: " + combo.getDescripcion());
		System.out.println("Valor del pedido: " + combo.getCosto() + "\n");
	}

}
