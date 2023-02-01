/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airtmetico1;

import java.util.Scanner;
public class Airtmetico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variables
        Scanner lector = new Scanner(System.in);
        double a, b, c, d, e, resultado;
        //captura de los datos
        System.out.print("Digitar el valor de a: ");
        a = lector.nextDouble();
        System.out.print("Digitar el valor de b: ");
        b = lector.nextDouble();
        System.out.print("Digitar el valor de c: ");
        c = lector.nextDouble();
        System.out.print("Digitar el valor de d: ");
        d = lector.nextDouble();
        System.out.print("Digitar el valor de e: ");
        e = lector.nextDouble();
        
        resultado = Math.pow(a+b-c, 3)/( Math.pow(d, 2) * Math.pow(e, 2) );
        System.out.println("El resultado es: "+resultado);
    }
    
}
