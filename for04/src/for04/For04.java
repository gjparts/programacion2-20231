package for04;
import java.util.Scanner;
public class For04 {
    public static void main(String[] args) {
        /*10) Hacer un programa que pida 10 numeros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo de
        cuantos numeros pares fueron leidos y cuantos numeros impares
        fueron leidos.*/
        Scanner s = new Scanner(System.in);
        int muestra = 10;   //tamaño de la muestra
        int suma = 0, conteoPares = 0, conteoImpares = 0;   //acumuladores y contadores 
        int numero; //variable temporal para captura de datos
        int promedio;   //promedio de los numeros leidos
        
        for( int i = 1; i <= muestra; i++ ){
            System.out.print("Digitar un numero entero: ");
            numero = s.nextInt();
            
            suma += numero; //agregar el numero leido a la suma
            
            if( numero%2 == 0 )
                conteoPares++;  //es par
            else
                conteoImpares++;    //es impar
        }
        //calcular el promedio
        promedio = suma/muestra;
        System.out.println("El promedio de los numeros leidos es: "+promedio);
        System.out.println("Numeros pares leidos: "+conteoPares);
        System.out.println("Numeros impares leidos: "+conteoImpares);
    }
    
}
