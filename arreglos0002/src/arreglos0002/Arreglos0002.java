package arreglos0002;

import java.util.Random;    //clase para generar numeros al azar
public class Arreglos0002 {

    public static void main(String[] args) {
        //arreglo unidimensional vacio de numeros enteros de tamaño 50
        int arreglo[] = new int[50];
        //crear un objeto de tipo Random
        Random r = new Random();
        //variable acumulador
        int suma = 0;
        
        //llenar cada item del arreglo con numeros al azar entre 5 y 47 no importa que
        //halla numeros repetidos
        for( int i = 0; i < arreglo.length; i++ )
        {
            arreglo[i] = r.nextInt(47-5+1)+5;
            System.out.println( arreglo[i] );
            suma += arreglo[i];
        }
        //imprimir la suma y el promedio de los numeros guardados dentro del arreglo
        System.out.println("La suma es "+suma+"\nel promedio es "+(suma/arreglo.length));
    }
    
}
