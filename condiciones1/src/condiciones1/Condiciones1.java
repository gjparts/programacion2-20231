package condiciones1;

import java.util.Scanner;
public class Condiciones1 {

    public static void main(String[] args) {
        //capturar dos numeros e imprimir el mayor de ellos
        //si los dos numeros son iguales entonces imprimir que son iguales.
        //declarar las variables
        Scanner s = new Scanner(System.in);
        float a, b;
        System.out.print("Digitar el primer numero: ");
        a = s.nextFloat();
        System.out.print("Digitar el segundo numero: ");
        b = s.nextFloat();
        
        if( a > b )
            System.out.println("El numero mayor es "+a);
        else
        {
            if( b > a )
                System.out.println("El numero mayor es "+b);
            else
                System.out.println("Los dos numeros son iguales.");
        }
            
    }
    
}
