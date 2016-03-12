
package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public abstract class FiguraGeometrica {
    
    protected Dibujo dibujarLinea;
    
    protected FiguraGeometrica(Dibujo dibujarLinea){
        this.dibujarLinea = dibujarLinea;
    }
    
    public abstract void dibujar();  
}
