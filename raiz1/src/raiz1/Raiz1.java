/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiz1;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Raiz1 {
    public static void main(String[] args) {
        //declarar variables
        Scanner lector = new Scanner(System.in);
        double a, b, c, d, resultado;
        //captura de los datos
        System.out.print("Digitar el valor de a: ");
        a = lector.nextDouble();
        System.out.print("Digitar el valor de b: ");
        b = lector.nextDouble();
        System.out.print("Digitar el valor de c: ");
        c = lector.nextDouble();
        System.out.print("Digitar el valor de d: ");
        d = lector.nextDouble();
        
        resultado = Math.sqrt( (a+b+c)/(5*d) );
        System.out.println("El resultado es "+resultado);
    }
    
}
