/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico2;

import java.util.Scanner;
public class Aritmetico2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c, resultado, discriminante, numerador, denominador;
        System.out.print("Digitar el valor de a: ");
        a = s.nextDouble();
        System.out.print("Digitar el valor de b: ");
        b = s.nextDouble();
        System.out.print("Digitar el valor de c: ");
        c = s.nextDouble();
        
        //operar la expersion por partes
        discriminante = Math.pow(b, 2)-4*a*c;
        numerador = -b+Math.sqrt(discriminante);
        denominador = 2*a;
        resultado = numerador/denominador;
        
        if( discriminante < 0 )
        {
            System.out.println("El discriminante es negativo, no se puede continuar.");
            System.out.println("Adios!");    
        }
        else
        {
            if( denominador == 0 )
            {
                System.out.println("El denominador no puede ser cero.");
            }
            else
            {
                System.out.println("El resultado es: "+resultado);
            }
        }
    }
}
