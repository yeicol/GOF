package Estructurales.Facade;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Cliente extends Persona{

	public Cliente(String nombre, long identificacion) {
		super(nombre, identificacion);
	}

	public void efectuarPago(){
		System.out.println("El cliente " + nombre + " ha pagado");
	}
	
	public void firmarContrato() {
		System.out.println("El cliente " + nombre + " firma el contrato");
	}
}
