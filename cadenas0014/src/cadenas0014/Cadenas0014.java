package cadenas0014;
import java.util.Scanner;
public class Cadenas0014 {

    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario digitar una cadena
        de texto (cadena A) y luego
        pida digitar otra cadena de texto (cadena B), por ultimo pedirle
        al usuario que digite en que posicion (numero entero) desea que la
        cadena B se inserte dentro de la cadena A
        **** Generar una nueva cadena de texto en base a ello e imprimirla.

        ejemplo:
        digitar cadena A: gerardo portillo
        digitar cadena B: josue
        digitar posicion de insercion: 1

        resultado:
        gjosueerardo portillo

        -> importante: si se digita una posicion que no existe
        dentro de la cadena A entonces decirle al usuario que no se puede.*/
        Scanner s = new Scanner(System.in);
        String a,b;
        int posicion;
        System.out.print("Digitar la cadena A: ");
        a = s.nextLine();
        System.out.print("Digitar la cadena B: ");
        b = s.nextLine();
        System.out.print("Digitar la posicion de insercion: ");
        posicion = s.nextInt();
        
        //validar que la posicion este dentro de los limites de la cadena A
        if( posicion < 0 || posicion > a.length() )
            System.out.println("Posicion no valida.");
        else
        {
            //para la nueva cadena extraeremos las substring antes de la posicion
            //y despues de la posicion de insercion.
            String antes, despues;
            antes = a.substring(0, posicion);
            despues = a.substring(posicion,a.length());
            
            //generar nueva cadena
            String nueva = antes+b+despues;
            System.out.println("La nueva cadena de texto es: "+nueva);
        }
    }
    
}
