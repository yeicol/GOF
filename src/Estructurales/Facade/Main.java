/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructurales.Facade;

/**
 *
 * @author Administrador
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Juan Perez", 1088124512);
		Cliente cliente = new Cliente("Arnulfo Gomez", 1110415214);
		Inmueble inmueble = new Inmueble("Casa estudio");
		Alquiler alquiler = new Alquiler();
		Inmobiliaria inmobiliaria = new Inmobiliaria(alquiler, inmueble, cliente, vendedor);
		
		inmobiliaria.alquilarInmueble();
		System.out.println("------------------------");
		inmobiliaria.cobrarAlquiler();
		
	}
	
}
