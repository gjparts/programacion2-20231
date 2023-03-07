package cadenas0008;
import java.util.Scanner;
public class Cadenas0008 {

    public static void main(String[] args) {
        /*digitar una cadena de texto y luego imprimirla dejando
        tres espacios en blanco entre cada caracter, sin afectar
        a la cadena original. Por ejemplo:
        Digite un texto: Gerardo
        Resultado:
        G   e   r   a   r   d   o
        Cadena original: Gerardo
        */
        Scanner s = new Scanner(System.in);
        String cadena;
        System.out.print("Digite un texto: ");
        cadena = s.nextLine();
        
        //imprimir la cadena dejando tres espacios
        //en blanco entre cada caracter
        System.out.println("Resultado:");
        for( int i = 0; i < cadena.length(); i++ ){
            //imprimir cada caracter
            System.out.print( cadena.charAt(i) );
            System.out.print("   ");
        }
        //hemos terminado de recorrer la cadena, pasar al siguiente renglon
        System.out.println("\nCadena original: "+cadena);
        
        //imprimir la cadena leida pero al reves caracter por caracter
        //por ejemplo:
        //cadena al reves: odrareG
        System.out.print("Cadena al reves: ");
        for( int i = cadena.length()-1; i >= 0; i-- ){
            System.out.print( cadena.charAt(i) );
        }
        System.out.println("");
    }
    
}
