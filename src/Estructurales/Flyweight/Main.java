package Estructurales.Flyweight;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {


		String[] colores = {"gris", "verde", "azul", "naranja", "violeta"};
		Pelota pelota = new Pelota(5.2);
		for (int i = 0; i < colores.length; i++) {
			pelota.setColor(colores[i]);			
			System.out.print("Dibujada Pelota " + pelota.getColor());
			System.out.println(" de " + pelota.getDiametro() + "cm de diametro ");
			System.out.println("------------------------------------------------");
		}
	}

}
