
package Creacionales.AbstractFactory;
/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 * @author Madelin Rangel Grisales
 */
class PlasmaAmarillo extends Plasma {

    public PlasmaAmarillo() {
    }

    @Override
    public void producir() {
        System.out.println("Producido " + this.getClass().getSuperclass().getSimpleName() + " de color Amarillo");
    }

}
