package Estructurales.Adapter;

/**
 *
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Sistema {

    public void trabajarMotorComun() {
        Motor motorComun = new Comun();
        motorComun.encender();
        motorComun.apagar();
    }

    public void trabajarMotorEconomico() {
        Motor motorEconomico = new Economico();
        motorEconomico.encender();
        motorEconomico.apagar();
    }

    public void trabajarMotorElectrico() {
        Motor motorElectrico = new ElectricoAdapter();
        motorElectrico.encender();
        motorElectrico.apagar();
    }
}
