package Estructurales.Proxy;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorDocumentos editor = new EditorDocumentos();
        Grafico grafico = new ImagenProxy("patron-proxy.png");
        editor.cargarDocumento(grafico);
    }
    
}
