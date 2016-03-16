package Estructurales.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite
 * 
 * @author Madelin Rangel Grisales
 * @author Brian Yeicol Restrepo Tangarife
 */
public class Llanta implements PiezaTaller{
    
    private String nombre;
    private double precio;

    public Llanta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
  
    List<PiezaTaller> piezaTaller = new ArrayList<PiezaTaller>();
    public void adicionar(PiezaTaller pieza) {
       piezaTaller.add(pieza);
    }
    
    public void eliminar(PiezaTaller pieza){
        piezaTaller.remove(pieza);
    }   
    
    public void mostrar() {
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: "+getPrecio());
        System.out.println("--------------------------------------------------");

        Iterator<PiezaTaller> piezaIterator = piezaTaller.iterator();
        while(piezaIterator.hasNext())
        {
            PiezaTaller  pieza = piezaIterator.next();
            pieza.mostrar();
        }
    }
    
    public PiezaTaller getNodo(int i){
        return piezaTaller.get(i);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }  
   
}
