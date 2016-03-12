package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class ElectricoAdapter implements Motor{
    
    private final Electrico motorElectrico;
    
    public ElectricoAdapter(){
        this.motorElectrico = new Electrico();
        this.motorElectrico.conectar();
        this.motorElectrico.desconectar();
    }    
    
    @Override
    public void encender() {         
        System.out.println("Motor eléctrico encendido"); 
    }

    @Override
    public void apagar() {
       System.out.println("Motor eléctrico apagado"); 
    }
}
