package cadenas0007;
import java.util.Scanner;
public class Cadenas0007 {

    public static void main(String[] args) {
        // extraer caracteres de una cadena
        String cadena;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite un texto: ");
        cadena = s.nextLine();
        
        //bloque de caza de errores
        try{
            //codigo propenso a falla
            System.out.println("el primer caracter es: "+cadena.charAt(0));
            System.out.println("el quinto caracter es: "+cadena.charAt(4));
            System.out.println("el ultimo cacracter es: "+cadena.charAt( cadena.length()-1 ));
        }catch(Exception ex){
            //lo que sucedera en caso de falla
            //System.out.println( ex.getMessage() );
        }
        
        System.out.println("Aqui termina el programa");
    }
    
}
