package Estructurales.Composite;

/**
 * Component
 * 
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public interface PiezaTaller {

    public void adicionar(PiezaTaller pieza);
    public void eliminar(PiezaTaller pieza);
    public PiezaTaller getNodo(int i);
    public String getNombre();
    public double getPrecio();
    public void mostrar();
    
}
