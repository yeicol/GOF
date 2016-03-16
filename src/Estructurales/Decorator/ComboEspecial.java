package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ComboEspecial extends Combo {

	public ComboEspecial() {
		descripcion = "1 hamburguesa, 1 porcion de papas fritas, malteada";
	}

	
	@Override
	public int getCosto() {
		return 16000;
	}

}
