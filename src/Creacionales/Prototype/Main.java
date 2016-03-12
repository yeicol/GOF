/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.Prototype;

/**
 *
 * @author jvelez
 */
public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        almacen.setBicicleta("BicicletaParaCompra", new Bicicleta("Azul", 26));
        almacen.setBicicleta("BicicletaParaMostrar", new Bicicleta("Roja", 29));
        
        try{
            System.out.println("--------------\nBicicleta para comprar");
            Bicicleta bicletaCompra = (Bicicleta) almacen.getBicicleta("BicicletaParaCompra").Clone();
            System.out.println("--------------\nBicicleta para mostrar a la persona");
            Bicicleta bicletaMuestra = (Bicicleta) almacen.getBicicleta("BicicletaParaMostrar").Clone();

        }catch(Exception e){}
    }
}
