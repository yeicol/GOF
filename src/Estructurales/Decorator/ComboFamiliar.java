package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ComboFamiliar extends Combo {

	public ComboFamiliar() {
		descripcion = "4 Hamburguesas, 4 porcion de papas fritas, gaseosas 1.5 litros";
	}

	@Override
	public int getCosto() {
		return 27000;
	}

}
