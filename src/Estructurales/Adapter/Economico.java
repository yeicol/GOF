package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Economico implements Motor{
    
    public Economico(){
        System.out.println("Motor económico creado"); 
    }    
    
    @Override
    public void encender() {
        System.out.println("Motor económico encendido"); 
    }

    @Override
    public void apagar() {
       System.out.println("Motor económico apagado"); 
    }
}
