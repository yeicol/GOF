package Creacionales.Builder;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public interface PizzaBuilder {

    public void agregarMasa();

    public void agregarSalsa();

    public void agregarRelleno();

    public Pizza getPizza();
}
