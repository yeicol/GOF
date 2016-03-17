package Creacionales.FactoryMethod;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Main {
    public static void main(String[] args) {
		
		TrianguloFabrica trianguloFabrica = new TrianguloConcreto();
		
		Triangulo triangulo = trianguloFabrica.crearTringulo(50, 50, 50);
		triangulo = trianguloFabrica.crearTringulo(60, 50, 50);
		triangulo = trianguloFabrica.crearTringulo(60, 50, 70);
    }
}
