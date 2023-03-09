package cadenas0013;
import java.util.Scanner;
public class Cadenas0013 {

    public static void main(String[] args) {
        //substring o substr.
        //devuelve una porcion de una cadena de texto.
        /*Hacer un programa que pregunte el DNI sin guiones,
        una vez digitado mostrar la composicion del DNI asi
        como en este ejemplo:
        digitar DNI (sin guiones): 0501197900012
        
        Departamento: 05
        Municipio: 01
        Anio de nacimiento: 1979
        Correlativo: 00012      */
        Scanner s = new Scanner(System.in);
        System.out.print("digitar DNI (sin guiones): ");
        String dni = s.nextLine();
        
        if( dni.contains("-") == true )
            System.out.println("El DNI no debe de llevar guiones.");
        else
        {
            try{
                //codigo propenso a error
                //mostrar los segmentos de la cadena
                String depto, munic, anio, corr;
                depto = dni.substring(0, 2);
                System.out.println("Departamento: "+depto);

                munic = dni.substring(2,4);
                System.out.println("Municipio: "+munic);

                anio = dni.substring(4,8);
                System.out.println("Año: "+anio);

                corr = dni.substring(8,13);
                System.out.println("Correlativo: "+corr);
            }catch(Exception ex){
                //en caso de error:
                System.out.println("La cedula digitada debe ser de al menos 13 caracteres.");
            }
            
        }
    }
    
}
