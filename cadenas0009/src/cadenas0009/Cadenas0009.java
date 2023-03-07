package cadenas0009;
import java.util.Scanner;
public class Cadenas0009 {
    public static void main(String[] args) {
        //reemplazar informacion dentro de una cadena
        String texto = "Roja es la Manzana, la manzana es Roja";
        
        texto = texto.replace("Roja", "Verde");
        
        System.out.println(texto);
        
        /*leer una cadena de texto, y reemplazar dentro
        de ella todos los espacios en blanco por
        guiones bajos, ejemplo:
        Gerardo Josue Portillo
        resultado:
        Gerardo_Josue_Portillo
        */
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar una cadena de texto: ");
        String cadena = s.nextLine();
        
        //realizar el reemplazo
        cadena = cadena.replace(" ", "_");
        
        System.out.println("Resultado: "+cadena);
        System.out.println("Cadena original: "+cadena);
    }
    
}
