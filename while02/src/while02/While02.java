package while02;
import java.util.Scanner;
public class While02 {
    public static void main(String[] args) {
        /*3) Hacer un programa que lea N cantidad de numeros positivos.
            ->  La lectura de numeros terminara cuando se lea un numero
                negativo.
            ->  Una vez concluida la lectura de numeros mostraremos la
                suma de los numeros positivos capturados.
            ->  mostrar tambien el promedio de los numeros leidos*/
        //variables
        Scanner s = new Scanner(System.in);
        double numero = 0; //valor bandera para capturar numeros
                        //tambien sera la variable de control
        double suma = 0, muestra = 0;    //variables acumuladoras
        
        while( numero >= 0 )    //mientras el numero ingresado sea positivo...
        {
            System.out.print("Digitar un numero: ");
            numero = s.nextDouble();
            
            if( numero >= 0 )
            {
                suma += numero; //sumar solo si es positivo
                muestra++;  //suma 1 a la muestra
            }
        }
        System.out.println("La suma de los positivos leidos es: "+suma);
        System.out.println("El promedio de los positivos leidos es: "+(suma/muestra));
    }
    
}
