
package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Cuadrado extends FiguraGeometrica{
    
     public Cuadrado(Dibujo dibujarLinea) {
        super(dibujarLinea);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadrado");
        dibujarLinea.dibujarLinea();
    }
}
