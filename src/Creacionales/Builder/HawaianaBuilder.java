package Creacionales.Builder;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class HawaianaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaianaBuilder() {
        this.pizza = new Pizza("Hawaiana");
    }

    @Override
    public void agregarMasa() {
        pizza.setComponente("Masa", "Suave");
    }

    @Override
    public void agregarSalsa() {
        pizza.setComponente("Salsa", "Dulce");
    }

    @Override
    public void agregarRelleno() {
        pizza.setComponente("Relleno", "Queso, piña y jamón");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

}
