
package Creacionales.AbstractFactory;
/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
public class LCDAzul extends LCD{

    @Override
    public void producir() {
        System.out.println("Producido " + this.getClass().getSuperclass().getSimpleName() + " de color Azul");
    }

}
