package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Carne extends DecoradorCombo {

	Combo combo;

	public Carne(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + ", Porcion de Carne";
	}

	@Override
	public int getCosto() {
		return combo.getCosto() + 5000;
	}

}
