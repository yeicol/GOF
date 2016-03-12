package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Comun implements Motor{

    public Comun(){
        System.out.println("Motor común creado"); 
    }    
    
    @Override
    public void encender() {
        System.out.println("Motor común encendido"); 
    }

    @Override
    public void apagar() {
       System.out.println("Motor común apagado"); 
    }
    
}
