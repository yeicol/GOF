package Estructurales.Composite;

/**
 * Leaf
 * 
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Tornillo implements PiezaTaller{

      private String nombre;
    private double precio;

    public Tornillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
  
   public void adicionar(PiezaTaller pieza) {
       System.out.println("No puede agregar piezas a un tornillo");
    }
    
    public void eliminar(PiezaTaller pieza){
        System.out.println("No puede quitarle nada a un tornillo");
    }   
    
    public void mostrar() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("--------------------------------------------------");        
    }
    
    public PiezaTaller getNodo(int i){
        System.out.println("No obtenre piezas de un tornillo");
        return null;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }  
}
