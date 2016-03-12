package Creacionales.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class Almacen {

    private final Map<String, PrototipoBicicleta> bicicletas;

    public Almacen() {
        this.bicicletas = new HashMap<>();
    }

    public PrototipoBicicleta getBicicleta(String clave) {
        return bicicletas.get(clave);
    }

    public void setBicicleta(String clave, PrototipoBicicleta valor) {
        bicicletas.put(clave, valor);
    }
}
