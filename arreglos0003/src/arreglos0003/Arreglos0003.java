package arreglos0003;
import java.util.Scanner;
import java.util.Random;

public class Arreglos0003 {
    
    //crear una variable global (propiedad de clase)
    //para que arreglo este disponible en todas las funciones/metodos
    //de la clase
    //ponemos static porque nuestro main es static.
    static int[] arreglo = new int[10];
    //variable para almacenar la suma de todos los elementos del arreglo
    static int suma = 0;
    
    public static void main(String[] args) {
        
        
        /*Hacer un programa que tenga un arreglo unidimensional
        de enteros de 10 posiciones.
        mostrar al usuario un menu como el siguiente:
        1) Llenar el arreglo con numeros al azar
        2) Imprimir el arreglo
        3) Mostrar la suma de todos los elementos del arreglo
        4) Mostrar el mayor numero de todos los elementos del arreglo
        5) Salir
        
        nota: los numeros al azar deberan ser entre 1 y 1000
        Programar cada una de las opciones del menu, cuando se seleccione una
        opcion, el menu debera volver a mostrarse*/
        Scanner  s = new Scanner(System.in);
        int opcion;
        
        do
        {
            System.out.println("********** MENU **********");
            System.out.println("1) Llenar el arreglo con numeros al azar");
            System.out.println("2) Imprimir el arreglo");
            System.out.println("3) Mostrar la suma de todos los elementos del arreglo");
            System.out.println("4) Mostrar el mayor numero de todos los elementos del arreglo");
            System.out.println("5) Salir");
            System.out.print("Digitar la opcion deseada: ");
            opcion = s.nextInt();
            
            switch(opcion){
                case 1:
                    opcion1();  //mandar a llamar la funcion externa
                break;
                case 2:
                    opcion2();  //mandar a llamar la funcion externa
                break;
                case 3:
                    opcion3();  //mandar a llamar la funcion externa
                break;
                case 4:
                    opcion4();  //mandar a llamar la funcion externa
                break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }while( opcion != 5 );
    }   //aqui se termina en main
    
    //funciones
    //funcion que ejecuta el codigo de la opcion 1 del menu
    public static void opcion1(){
        System.out.println("\n\n\n\n\n\n\n\n\nGenerar numeros al azar en el arreglo");
        //lenar el arreglo con numeros al azar entre 1 y 1000
        Random azar = new Random();
        //resetar la variable suma
        suma = 0;
        for( int i = 0; i < arreglo.length; i++ ){
            arreglo[i] = azar.nextInt(1000-1+1)+1;
            suma += arreglo[i]; //sumar el numero generado
        }
    }
    //funcion que ejecuta el codigo de la opcion 2 del menu
    public static void opcion2(){
        System.out.println("\n\n\n\n\n\n\n\n\nImprimir el arreglo");
        //imprimir el arreglo
        for( int i = 0; i < arreglo.length; i++ ){
            System.out.println( "Posicion "+i+", valor: "+arreglo[i] );
        }
    }
    //funcion que ejecuta el codigo de la opcion 3 del menu
    public static void opcion3(){
        System.out.println("\n\n\n\n\n\n\n\n\nLa suma del arreglo es "+suma);
    }
    //funcion que ejecuta el codigo de la opcion 4 del menu
    public static void opcion4(){
        System.out.println("\n\n\n\n\n\n\n\n\nObtener el numero mayor");
        int mayor = Integer.MIN_VALUE;
        for( int i = 0; i < arreglo.length; i++ ){
            if( arreglo[i] > mayor )
                mayor = arreglo[i];
        }
        System.out.println("El numero mayor es: "+mayor);
    }
}
