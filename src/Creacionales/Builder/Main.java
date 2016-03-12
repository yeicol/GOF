package Creacionales.Builder;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        PizzaBuilder builder;

        builder = new HawaianaBuilder();
        restaurante.construir(builder);
        builder.getPizza().mostrar();

        builder = new PicanteBuilder();
        restaurante.construir(builder);
        builder.getPizza().mostrar();
    }

}
