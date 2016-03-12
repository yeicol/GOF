package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema trabajarMotor = new Sistema();
        System.out.println("\n--------------------------------------------------"); 
        trabajarMotor.trabajarMotorComun();
        System.out.println("\n--------------------------------------------------"); 
        trabajarMotor.trabajarMotorEconomico();
        System.out.println("\n--------------------------------------------------"); 
        trabajarMotor.trabajarMotorElectrico();
        
        System.out.println("\n"); 
    }
    
}
