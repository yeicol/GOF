package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Electrico {
    
    public Electrico(){
        System.out.println("Motor eléctrico creado"); 
    }    
    
    public void conectar() {
        System.out.println("Motor eléctrico conectado"); 
    }

    public void desconectar() {
       System.out.println("Motor eléctrico desconectado"); 
    }
}
