package Creacionales.Builder;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class PicanteBuilder implements PizzaBuilder {

    private Pizza pizza;

    public PicanteBuilder() {
        this.pizza = new Pizza("Picante");
    }

    @Override
    public void agregarMasa() {
        pizza.setComponente("Masa", "Dura");
    }

    @Override
    public void agregarSalsa() {
        pizza.setComponente("Salsa", "Picante");
    }

    @Override
    public void agregarRelleno() {
        pizza.setComponente("Relleno", "Queso, pimienta y salami");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

}
