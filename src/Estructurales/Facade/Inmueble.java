package Estructurales.Facade;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Inmueble {
	
	private String nombre;
	public  Inmueble (String nombre) {
		this.nombre = nombre;
	}
	public void mostrar(){
		System.out.println("Mostrar inmueble " +  nombre);
	}
}
