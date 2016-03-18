package Estructurales.Facade;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Vendedor extends Persona{

	public Vendedor(String nombre, long identificacion) {
		super(nombre, identificacion);
	}

	public void registrarPago() {
		System.out.println("El vendedor " + nombre + " registra el pago");
	}
	
	public void exhibirInmueble() {
		System.out.println("El vendedor " + nombre + " exhibe el inmueble");
	}
	
	public void elaborarContrato() {
		System.out.println("El vendedor " + nombre + " elabora el contrato de alquiler");
	}
}
