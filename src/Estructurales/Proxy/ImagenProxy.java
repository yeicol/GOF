package Estructurales.Proxy;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ImagenProxy implements Grafico {

    private Imagen imagen;

    public ImagenProxy() {
        this.imagen = null;
    }

    @Override
    public void dibujar() {
        if (this.imagen == null){
            this.imagen = new Imagen();
        }
        this.imagen.dibujar();
    }

}
