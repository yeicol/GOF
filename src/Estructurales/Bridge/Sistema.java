package Estructurales.Bridge;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Sistema {

    public void dibujarCirculoPunteado() {
        FiguraGeometrica circuloLineaPunteada = new Circulo(new Punteado());
        circuloLineaPunteada.dibujar();
    }

    public void dibujarCirculoNormal() {
        FiguraGeometrica circuloLineaNormal = new Circulo(new Normal());
        circuloLineaNormal.dibujar();
    }

    public void dibujarCirculoDoble() {
        FiguraGeometrica circuloLineaDoble = new Circulo(new Doble());
        circuloLineaDoble.dibujar();
    }

    public void dibujarCuadradoPunteado() {
        FiguraGeometrica cuadradoLineaPunteada = new Cuadrado(new Punteado());
        cuadradoLineaPunteada.dibujar();
    }

    public void dibujarCuadradoNormal() {
        FiguraGeometrica cuadradoLineaNormal = new Cuadrado(new Normal());
        cuadradoLineaNormal.dibujar();
    }

    public void dibujarCuadradoDoble() {
        FiguraGeometrica cuadradoLineaDoble = new Cuadrado(new Doble());
        cuadradoLineaDoble.dibujar();
    }

    public void dibujarRectanguloPunteado() {
        FiguraGeometrica rectanguloLineaPunteada = new Rectangulo(new Punteado());
        rectanguloLineaPunteada.dibujar();
    }

    public void dibujarRectanguloNormal() {
        FiguraGeometrica rectanguloLineaNormal = new Rectangulo(new Normal());
        rectanguloLineaNormal.dibujar();
    }

    public void dibujarRectanguloDoble() {
        FiguraGeometrica rectanguloLineaDoble = new Rectangulo(new Doble());
        rectanguloLineaDoble.dibujar();
    }
}
