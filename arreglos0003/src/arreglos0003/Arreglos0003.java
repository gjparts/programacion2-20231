package arreglos0003;
import java.util.Scanner;
public class Arreglos0003 {

    public static void main(String[] args) {
        /*Hacer un programa que tenga un arreglo unidimensional
        de enteros de 10 posiciones.
        mostrar al usuario un menu como el siguiente:
        1) Llenar el arreglo con numeros al azar
        2) Imprimir el arreglo
        3) Mostrar la suma de todos los elementos del arreglo
        4) Mostrar el mayor numero de todos los elementos del arreglo
        5) Salir
        
        nota: los numeros al azar deberan ser entre 1 y 1000
        Programar cada una de las opciones del menu, cuando se seleccione una opcion, el menu debera volver
        a mostrarse*/
        Scanner  s = new Scanner(System.in);
        int opcion;
        
        do
        {
            System.out.println("********** MENU **********");
            System.out.println("1) Llenar el arreglo con numeros al azar");
            System.out.println("2) Imprimir el arreglo");
            System.out.println("3) Mostrar la suma de todos los elementos del arreglo");
            System.out.println("4) Mostrar el mayor numero de todos los elementos del arreglo");
            System.out.println("5) Salir");
            System.out.print("Digitar la opcion deseada: ");
            opcion = s.nextInt();
        }while( opcion != 5 );
    }
    
}
