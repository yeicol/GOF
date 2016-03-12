package Creacionales.Builder;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Pizza {

    private String tipoPizza;
    private final Map<String, String> componentes = new HashMap<>();
    static PrintWriter out = new PrintWriter(System.out);

    public Pizza(String tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public String getTipoPizza() {
        return tipoPizza;
    }

    public String getParte(String clave) {
        return this.componentes.get(clave);
    }

    public void setParte(String clave, String valor) {
        this.componentes.put(clave, valor);
    }

    public void mostrar() {
        out.println("Tipo de Pizza: " + this.getTipoPizza());
        out.println("Tipo de Masa: " + this.getParte("Masa"));
        out.println("Tipo de Salsa: " + this.getParte("Salsa"));
        out.println("Relleno de: " + this.getParte("Relleno"));
        out.close();
    }
}
