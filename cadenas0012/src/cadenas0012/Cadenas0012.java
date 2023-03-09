package cadenas0012;
import java.util.Scanner;
public class Cadenas0012 {

    public static void main(String[] args) {
        /*hacer un programa que pregunte un texto el cual buscaremos
        dentro de otro texto predefinido por nosotros.
        El programa nos dirá si el texto que se busca esta
        dentro del texto predefinido por nosotros.*/
        String texto  = "El tiempo transcurre inexorable ante atardeceres\n";
        texto += "que no nos es menester contemplar. Luego vino Pedro y le\n";
        texto += "pregunto a Juan si se habia comunicado con Maria para\n";
        texto += "darle un recado a Rosa.";
        
        System.out.println("Texto donde se buscará: ");
        System.out.println(texto);
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite lo que desea buscar: ");
        String buscar = s.nextLine();
        //contains es case sentitive o sea no ignora mayusculas/minusculas
        if( texto.contains(buscar) == true )
            System.out.println("El texto buscado fue encontrado tomando en cuenta mayus/minus");
        else
            System.out.println("El texto buscado NO fue encontrado tomando en cuenta mayus/minus");
        
        //uso de contains ignorando mayusculas/minusculas
        if( texto.toUpperCase().contains(buscar.toUpperCase()) == true )
            System.out.println("El texto buscado fue encontrado ignorando mayus/minus");
        else
            System.out.println("El texto buscado NO fue encontrado ignorando mayus/minus");
    }
    
}
