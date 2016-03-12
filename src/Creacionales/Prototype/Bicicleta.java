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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiametroRuedas() {
        return diametroRuedas;
    }

    public void setDiametroRuedas(int diametroRuedas) {
        this.diametroRuedas = diametroRuedas;
    }
    
    public void mostrar(){
        System.out.print("Bicicleta " + this.color + " con ruedas de ");
        System.out.println(this.diametroRuedas + " pulgadas de diametro");
    }

    @Override
    public PrototipoBicicleta Clone() throws Exception {
        System.out.print("Clonando la bicicleta de color " + this.color);
        System.out.println(" y diametro de ruedas de " + this.diametroRuedas + " pulgadas");
        return (PrototipoBicicleta) this.clone();
    }

}
