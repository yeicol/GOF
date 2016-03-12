
package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema figuraGeometrica = new Sistema();
        System.out.println("\n--------------------------------------------------");
        figuraGeometrica.dibujarCirculoNormal();
        System.out.println("\n--------------------------------------------------");
        figuraGeometrica.dibujarCirculoDoble();
        System.out.println("\n--------------------------------------------------"); 
        figuraGeometrica.dibujarCirculoPunteado();
        System.out.println("\n--------------------------------------------------"); 
        figuraGeometrica.dibujarCuadradoNormal();
        System.out.println("\n--------------------------------------------------");
        figuraGeometrica.dibujarCuadradoDoble();
        System.out.println("\n--------------------------------------------------"); 
        figuraGeometrica.dibujarCuadradoPunteado();
        System.out.println("\n--------------------------------------------------");
        figuraGeometrica.dibujarRectanguloNormal();
        System.out.println("\n--------------------------------------------------");
        figuraGeometrica.dibujarRectanguloDoble();
        System.out.println("\n--------------------------------------------------"); 
        figuraGeometrica.dibujarRectanguloPunteado();
        System.out.println("\n--------------------------------------------------"); 
    }

}
