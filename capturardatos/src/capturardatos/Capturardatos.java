/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capturardatos;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Capturardatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarar variables
        Scanner lector = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Digitar el primer valor: ");
        num1 = lector.nextDouble();
        System.out.print("Digitar el segundo valor: ");
        num2 = lector.nextDouble();
        
        System.out.println("La suma de ambos numeros es "+(num1+num2));
    }
    
}
