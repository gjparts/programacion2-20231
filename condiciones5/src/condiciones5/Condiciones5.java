package condiciones5;

import java.util.Scanner;
public class Condiciones5 {

    public static void main(String[] args) {
        /*
        Hacer un programa que pregunte el numero de un mes, este debe
        ser un numero entero entre 1 y 12
        Luego preguntar el año.
        Posteriormente se imprimira el numero de dias que tiene dicho
        mes en el calendario.
        Para febrero si el año es multiplo de 4 entonces tendra 29 dias
        de lo contrario solo tendra 28 dias.
        */
        Scanner s = new Scanner(System.in);
        int m, a;
        System.out.print("Digitar el mes: ");
        m = s.nextInt();
        System.out.print("Digitar el año: ");
        a = s.nextInt();
        //procesamiento:
        if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
            System.out.println("El mes tiene 31 dias.");
        
        if( m == 4 || m == 6 || m == 9 || m == 11 )
            System.out.println("El mes tiene 30 dias.");
        
        if( m == 2 )
        {
            if( a%4 == 0 )
                System.out.println("El mes tiene 29 dias");
            else
                System.out.println("El mes tiene 28 dias");
        }
    }
    
}
