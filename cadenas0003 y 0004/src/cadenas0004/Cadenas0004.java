package cadenas0004;
import java.util.Scanner;
public class Cadenas0004 {

    public static void main(String[] args) {
        //bug que sucede al capturar en la consola de Windows
        //sucede cuando venimos de capturar cualquier numero
        //y posteriormente decidimos capturar una cadena
        //en el caso de JAVA usando el mismo Scanner
        Scanner s = new Scanner(System.in);
        int numero;
        String cadena;
        
        System.out.print("Digitar un numero por favor: ");
        numero = s.nextInt();
        //cuando venimos de leer un numero desde el Scanner
        //y queremos despues leer una cadena, debemos hacerle flush
        //al buffer de entrada de la consola:
        s.nextLine();
        
        System.out.print("Digitar una cadena de texto: ");
        cadena = s.nextLine();
        
        System.out.println("Gracias el programa ha terminado.");
    }
    
}
