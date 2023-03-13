package cadenas0016;
import java.util.Scanner;
public class Cadenas0016 {

    public static void main(String[] args) {
        /*Hacer un programa que diga cuantas palabras
        tiene una cadena de texto. Considerando que entre
        cada palabra hay solo un espacio en blanco. Si hay mas
        de un espacio entre palabras asegurarse que no se cuenten.
        La cadena la debe digitar el usuario.
        -> Tambien mostrar la cadena al reves pero palabra por palabra, ejemplo
        si pone "pera verde" entonces debe imprimir "verde pera"*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar una cadena: ");
        String str = s.nextLine();
        
        //partir la palabra en partes usando como token un espacio en blanco
        String palabras[] = str.split(" ");
        /*
        //temporalmente imprimimos lo que esta en el arreglo (para analisis)
        for( int i = 0; i < palabras.length; i++ )
            System.out.println( "**"+palabras[i]+"** size: "+palabras[i].trim().length() );
        */
        
        //contar como palabra solo aquellos elementos del array que tengan mas
        //de un caracter luego de eliminarle sus espacios
        int cantidadPalabras = 0; //variable contador
        for( int i = 0; i < palabras.length; i++ )
        {
            if( palabras[i].trim().length() > 0 )
                cantidadPalabras++;
        }
        System.out.println("Cantidad de palabras detectadas: "+cantidadPalabras);
        
        //cadena invertida palabra por palabras
        System.out.println("La cadena invertida palabra por palabra es: ");
        for( int i = palabras.length-1; i >= 0; i-- ){
            if( palabras[i].trim().length() > 0 )
                System.out.print( palabras[i].trim()+" " );
        }
        System.out.println("");
    }
    
}
