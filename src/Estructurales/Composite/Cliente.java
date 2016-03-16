
package Estructurales.Composite;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Cliente {
    
    public void agregarLLanta(){
        PiezaTaller llanta1 = new Llanta("LLanta Toyota", 200000);
        PiezaTaller llanta2 = new Llanta("LLanta Mazda", 80000);
    }
    
    public void agregarTornillo(){
        PiezaTaller tornillo = new Tornillo("Tornillo corto", 8000);
    }
}
