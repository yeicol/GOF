package Estructurales.Proxy;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Imagen implements Grafico {
                        
    public Imagen() {
        System.out.println("Imagen Cargada");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Imagen");
    }

}
