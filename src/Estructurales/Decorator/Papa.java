package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Papa extends DecoradorCombo {

	Combo combo;

	public Papa(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + ", Porcion de papas";
	}

	@Override
	public int getCosto() {
		return combo.getCosto() + 3000;
	}

}
