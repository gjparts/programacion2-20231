/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones3;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Condiciones3 {

    public static void main(String[] args) {
        /*Uso del operador logico AND
        Leer una edad de una persona y posteriormente imprimir a que
        grupo poblacional pertenece de acuerdo a la siguiente tabla:
        GRUPO               Rango de Edad
        menor de edad       menores de 18
        mayor de edad       entre 18 y 20
        adulto              entre 21 y 59
        tercera edad        de 60 en delante*/
        //declaracion de variables
        Scanner s = new Scanner(System.in);
        int edad;
        System.out.print("Digitar la edad: ");
        edad = s.nextInt();
        
        if( edad < 18 ){
            System.out.println("Menor de Edad");
            System.out.println("No puede ir preso");
        }
        
        if( edad >= 18 && edad <= 20 )
            System.out.println("Mayor de edad");
        
        if( edad >= 21 && edad <= 59 )
            System.out.println("Adulto");
        
        if( edad >= 60 )
            System.out.println("Tercera edad");
    }
}
