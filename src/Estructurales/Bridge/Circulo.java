
package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Circulo extends FiguraGeometrica{
    
    public Circulo(Dibujo dibujarLinea) {
        super(dibujarLinea);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
        dibujarLinea.dibujarLinea();
    }
    
}
