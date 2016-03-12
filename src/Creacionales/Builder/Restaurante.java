package Creacionales.Builder;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Restaurante {

    public void construir(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.agregarMasa();
        pizzaBuilder.agregarSalsa();
        pizzaBuilder.agregarRelleno();
    }
}
