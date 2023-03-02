package cadenas0006;
import java.util.Scanner;
public class Cadenas0006 {

    public static void main(String[] args) {
        /*capturar dos cadenas de texto y mostrar un mensaje indicando
        si estas son iguales o no, tomando en cuenta mayusculas y minusculas.*/
        Scanner s = new Scanner(System.in);
        String cadena1, cadena2;
        //entrada de datos
        System.out.print("Digitar la cadena 1: ");
        cadena1 = s.nextLine();
        System.out.print("Digitar la cadena 2: ");
        cadena2 = s.nextLine();
        //comparar las cadenas
        if( cadena1.equals(cadena2) == true )
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas no son iguales");
    }
    
}
