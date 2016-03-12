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

    public String getComponente(String clave) {
        return this.componentes.get(clave);
    }

    public void setComponente(String clave, String valor) {
        this.componentes.put(clave, valor);
    }

    public void mostrar() {
        out.print("Preparada pizza " + this.getTipoPizza());
        out.print(" de masa " + this.getComponente("Masa"));
        out.print(", salsa " + this.getComponente("Salsa"));
        out.println("y con relleno de " + this.getComponente("Relleno"));
        out.close();
    }
}
