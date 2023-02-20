package break01;
import java.util.Scanner;
public class Break01 {

    public static void main(String[] args) {
        /*UTILIZANDO UNA ESTRUCTURA FOR
        Hacer un programa que lea 100 numeros positivos,
        al finalizar la lectura el programa mostrara la suma de los
        100 numeros positivos.
        -> si durante la lectura de los 100 numeros se digitara un numero menor
            que cero entonces no continuar con la lectura de los numeros.
        -> desarrollarlo utilizando una estructura de repeticion for.*/
        Scanner s = new Scanner(System.in);
        int numero, suma = 0;
        for( int i = 1; i <= 100; i++ ){
            System.out.print("Digitar numero positivo: ");
            numero = s.nextInt();
            
            if( numero >= 0 )
                suma += numero; //numero positivo se suma
            else
                break;  //es un numero negativo (detiene el ciclo)
        }
        System.out.println("La suma de los positivos es: "+suma);
    }
    
}
