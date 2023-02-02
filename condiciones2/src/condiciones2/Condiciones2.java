/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Condiciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar.*/
        //declarar variables
        Scanner s = new Scanner(System.in);
        double montoCompra, descuento = 0.00, montoPagar;
        //entrada de datos
        System.out.print("Favor digitar el monto de la compra: ");
        montoCompra = s.nextDouble();
        //procesamiento
        if( montoCompra > 10000 )
            descuento = montoCompra*0.20;
        
        montoPagar = montoCompra-descuento;
        
        //salida
        System.out.println("El descuento es "+descuento);
        System.out.println("El monto a pagar es "+montoPagar);
    }
    
}
