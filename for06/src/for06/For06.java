package for06;

import java.util.Scanner;
public class For06 {
    public static void main(String[] args) {
        /*12) hacer un programa que pida al usuario
        un ancho y un alto como numeros enteros.
        El programa debe imprimir un rectangulo relleno de asteriscos
        en base al alto y ancho digitados.*/
        Scanner s = new Scanner(System.in);
        int ancho, alto;
        System.out.print("Digitar el ancho: ");
        ancho = s.nextInt();
        System.out.print("Digitar el alto: ");
        alto = s.nextInt();
        
        for( int i = 1; i <= alto; i++ ) //la altura da la cantidad de lineas
        {
            for( int j = 1; j <= ancho; j++ ) //el ancho da el numero de * x linea
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
