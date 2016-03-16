package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public abstract class Combo {

	String descripcion = "";

	public String getDescripcion() {
		return descripcion;
	}
	
	public abstract int getCosto();
}
