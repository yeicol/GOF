package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Tomate extends DecoradorCombo {

	Combo combo;

	public Tomate(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + ", tomates";
	}

	@Override
	public int getCosto() {
		return combo.getCosto() + 5000;
	}

}
