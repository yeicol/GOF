/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructurales.Facade;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Inmobiliaria {

	private Alquiler alquiler;
	private Inmueble inmueble;
	private Cliente cliente;
	private Vendedor vendedor;

	public Inmobiliaria(Alquiler alquiler, Inmueble inmueble, Cliente cliente, Vendedor vendedor) {
		this.alquiler = alquiler;
		this.inmueble = inmueble;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	public void cobrarAlquiler() {
		alquiler.cobrar();
		cliente.efectuarPago();
		vendedor.registrarPago();
	}

	public void alquilarInmueble() {
		inmueble.mostrar();
		vendedor.exhibirInmueble();
		vendedor.elaborarContrato();
		cliente.firmarContrato();
	}
}
