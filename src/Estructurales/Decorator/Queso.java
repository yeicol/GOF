package Estructurales.Decorator;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Queso  extends DecoradorCombo {

	Combo combo;

	public Queso(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String getDescripcion() {
		return combo.getDescripcion() + ", Queso";
	}

	@Override
	public int getCosto() {
		return combo.getCosto() + 3000;
	}

}