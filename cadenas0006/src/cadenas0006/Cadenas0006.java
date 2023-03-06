package cadenas0006;
import java.util.Scanner;
public class Cadenas0006 {

    public static void main(String[] args) {
        /*capturar dos cadenas de texto y mostrar un mensaje indicando
        si estas son iguales o no, tomando en cuenta mayusculas y minusculas.
        Realice tambien una comparacion de ambas cadenas ignorando
        mayusculas/minusculas y mostrar bajo esta premisa si son iguales.*/
        Scanner s = new Scanner(System.in);
        String cadena1, cadena2;
        //entrada de datos
        System.out.print("Digitar la cadena 1: ");
        cadena1 = s.nextLine();
        System.out.print("Digitar la cadena 2: ");
        cadena2 = s.nextLine();
        //comparar las cadenas
        if( cadena1.equals(cadena2) == true )
            System.out.println("Las cadenas son iguales considerando mayusc./minusc.");
        else
            System.out.println("Las cadenas no son iguales considerando mayusc./minusc.");
        
        //comparar ambas cadenas ignorando el character casing
        if( cadena1.equalsIgnoreCase(cadena2) == true )
            System.out.println("Las cadenas son iguales ignorando mayusc./minusc.");
        else
            System.out.println("Las cadenas no son iguales ignorando mayusc./minusc.");
        
        //imagine que no existe equalsIgnoreCase, que otra forma puede usar para comparar
        //ignorando mayusc./minusc.
        if( cadena1.toUpperCase().equals( cadena2.toUpperCase() ) == true )
            System.out.println("Las cadenas son iguales ignorando mayusc./minusc. (forma 2)");
        else
            System.out.println("Las cadenas no son iguales ignorando mayusc./minusc. (forma 2)");
    }
    
}
