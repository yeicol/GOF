/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacionales.AbstractFactory;

/**
 *
 * @author Yeicol
 */
public class Main {

    public static void main(String[] args) {
//    GUIBuilder builder = new GUIBuilder();
//    AbstractWidgetFactory widgetFactory = null;
//    //check what platform we're on
//    if(Platform.currentPlatform()=="MACOSX"){
//      widgetFactory  = new MacOSXWidgetFactory();
//    } else {
//      widgetFactory  = new MsWindowsWidgetFactory();
//    }
//    builder.buildWindow(widgetFactory);

        Cliente cliente = new Cliente();
        ITelevisorFactory lcdAzul = new AzulFactory();
        cliente.construirTelevisor(lcdAzul);

    }
}
