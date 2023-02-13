package for02;

import java.util.Scanner;
public class For02 {
    public static void main(String[] args) {
        /*9) Hacer un programa que pida al usuario 10 numeros,
            al finalizar el programa imprimira la suma de esos 10 numeros,
            asi como cual es el mayor de los 10 numeros.*/
        //declarar variables
        Scanner s = new Scanner(System.in);
        int suma = 0;   //variable acumuladora
        int numero;     //variable temporal para capturar un numero
        int mayor = Integer.MIN_VALUE;      //variable bandera para determinar quien es el mayor
        int menor = Integer.MAX_VALUE;  //variable bandera para determinar quien es el menor
        /*si fuera double: Double.MIN_VALUE*/
        /*si fuera float: Float.MIN_VALUE*/
        //leer los 10 numeros
        for( int i = 1; i <= 10; i++ )
        {
            System.out.print("Digitar un numero:");
            numero = s.nextInt();
            
            //sumar el numero leido a la variable acumulador
            suma += numero; //suma = suma + numero;
            
            //verificar si el numero recien leido es mas grande que el numero actualmente mayor
            if( numero > mayor )
                mayor = numero;     //..entonces el nuevo mayor es el numero que leimos.
            //verificar si el numero recien leido es mas pequeño que el numero actualmente menor
            if( numero < menor )
                menor = numero; //..entonces el nuevo menor es el numero que leimos.
        }
        //al finalizar se imprime la suma de los 10 numeros
        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
    }
}
