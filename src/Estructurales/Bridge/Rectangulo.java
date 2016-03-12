
package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(Dibujo dibujarLinea) {
        super(dibujarLinea);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo");
        dibujarLinea.dibujarLinea();
    }

}
