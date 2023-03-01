package cadenas0002;
import java.util.Scanner;
public class Cadenas0002 {

    public static void main(String[] args) {
        /*leer una cadena de texto y avisar si esta viene en blanco, de
        lo contrario imprimirla en mayusculas y minusculas sin relleno
        de espacios
        Una cadena llena unicamente de espacios sera cadena en blanco.*/
        Scanner s = new Scanner(System.in);
        String cadena;
        
        System.out.print("Favor digitar una cadena de texto: ");
        cadena = s.nextLine();
        //si el tamaño de la cadena sin relleno es 0 entonces esta vacia
        if( cadena.trim().length() == 0 ){
            System.out.println("La cadena esta vacia");
        }
        else
        {
            System.out.println("La cadena es mayusculas es: "+cadena.trim().toUpperCase());
            System.out.println("La cadena es minusculas es: "+cadena.trim().toLowerCase());
        }
    }
    
}
