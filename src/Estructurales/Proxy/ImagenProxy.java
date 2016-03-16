package Estructurales.Proxy;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class ImagenProxy implements Grafico {

    private Imagen imagen;
    private String nombreImagen;

    public ImagenProxy(String nombreImagen) {
        this.nombreImagen = nombreImagen;
        this.imagen = null;
    }

    @Override
    public void dibujar() {
        if (this.imagen == null) {
            this.imagen = new Imagen(nombreImagen);
        }
        this.imagen.dibujar();
    }

}
