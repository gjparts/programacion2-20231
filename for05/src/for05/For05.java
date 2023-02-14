package for05;

import java.util.Scanner;
public class For05 {

    public static void main(String[] args) {
        /*11) pedir al usuario un numero entero,
        luego imprimir una linea horizontal
        de asteriscos que tenga tantos asteriscos como
        el numero digitado por el usuario.*/
        Scanner s = new Scanner(System.in);
        int longitud;
        
        System.out.print("Digitar el tamaño de la linea: ");
        longitud = s.nextInt();
        
        for( int i = 1; i <= longitud; i++ )
            System.out.print("*");
        
        System.out.println("");
    }
    
}
