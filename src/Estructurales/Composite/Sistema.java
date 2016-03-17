
package Estructurales.Composite;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Sistema {
    
    public void agregarLLanta(){
        PiezaTaller llanta = new Llanta("LLanta Toyota", 120000);
        llanta.mostrar();
    }
    
    public void agregarTornillo(){
        PiezaTaller tornillo = new Tornillo("Tornillo corto", 7000);
        tornillo.mostrar();
    }
    
    public void agregarRueda(){
        PiezaTaller llanta = new Llanta("LLanta Mazda", 75000);
        PiezaTaller tornillo1 = new Tornillo("Tornillo N°1", 5000);
        PiezaTaller tornillo2 = new Tornillo("Tornillo N°2", 5000);
        PiezaTaller tornillo3 = new Tornillo("Tornillo N°3", 5000);
        PiezaTaller tornillo4 = new Tornillo("Tornillo N°4", 5000);
        
        llanta.adicionar(tornillo1);
        llanta.adicionar(tornillo2);
        llanta.adicionar(tornillo3);
        llanta.adicionar(tornillo4);
        
        llanta.mostrar();
    }
    
    
}
