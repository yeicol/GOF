package Estructurales.Proxy;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Imagen implements Grafico {

    private String nombreImagen;

    public Imagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
        System.out.println("Imagen \"" + nombreImagen + "\" Cargada");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Imagen \"" + nombreImagen + "\"");
    }

}
