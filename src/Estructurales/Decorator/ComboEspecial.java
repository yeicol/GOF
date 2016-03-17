package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ComboEspecial extends Combo {

	public ComboEspecial() {
		descripcion = "Hamburguesa, ensalada, malteada";
	}

	
	@Override
	public int getCosto() {
		return 16000;
	}

}
