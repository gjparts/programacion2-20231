package cadenas0011;
import java.util.Scanner;
public class Cadenas0011 {

    public static void main(String[] args) {
        /*Pedir al usuario que digite su numero de cedula, pero sin guiones.
        Si el usuario digita guiones entonces le mostramos
        un mensaje: CEDULA NO DEBE TENER GUIONES*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su DNI, favor no usar guiones: ");
        String cadena = s.nextLine();        
        
        //primero lo resolveremos sin la funcion contains
        //para ello tendriamos que recorrer la cadena y comparar caracter
        //por caracter a ver si encontramos un guion
        for(int i = 0; i < cadena.length(); i++ ){
            if( cadena.charAt(i) == '-' ){
                System.out.println("Sin utilizar el metodo contains:");
                System.out.println("El DNI tiene guiones no se puede continuar.");
                break;
            }
        }
        
        //para este ejercicio usaremos la funcion contains
        //contains busca una String dentro de otra String.
        if( cadena.contains("-") == true )
        {
            System.out.println("Utilizando el metodo contains:");
            System.out.println("El DNI tiene guiones no se puede continuar.");
        }
    }
    
}
