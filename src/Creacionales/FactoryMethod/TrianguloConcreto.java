package Creacionales.FactoryMethod;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class TrianguloConcreto implements TrianguloFabrica {

	public Triangulo crearTringulo(int ladoA, int ladoB, int ladoC) {
		if (ladoA == ladoB && ladoB == ladoC) {
			return new Equilatero();
		} else if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
			return new Escaleno();
		} else {
			return new Isoceles();
		}

	}

}
