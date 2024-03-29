package Creacionales.Prototype;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Bicicleta extends PrototipoBicicleta implements Cloneable {

    private String color;
    private int diametroRuedas;

    public Bicicleta(String color, int diametroRuedas) {
        this.color = color;
        this.diametroRuedas = diametroRuedas;
    }

    @Override
    public PrototipoBicicleta Clone() throws Exception {
        System.out.print("Clonando la bicicleta " + this.color + " y diametro ");
        System.out.println("de ruedas de " + this.diametroRuedas + " pulgadas");
        return (PrototipoBicicleta) this.clone();
    }

}
