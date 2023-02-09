/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for01;

/**
 *
 * @author Gerardo
 */
public class For01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        for( int i = 1; i <= 10; i++ )
            System.out.println( i );
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        System.out.println("************");
        for( int i = 0; i <= 50; i+=2 )
            System.out.println( i );
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco
        System.out.println("************");
        for( int i = 0; i <= 50; i+=5 )
            System.out.println(i);
        
        //4) recorrer los numeros del 0 al 50;
        //pero solo imprimir los numeros impares.
        System.out.println("************");
        //forma 1: usando if
        for( int i = 0; i <= 50; i++ )
        {
            //decido que solo imprimire los impares
            if( i%2 == 1 )
                System.out.println(i);
        }
        //forma 2: aprovechar la propia estructura for
        for( int i = 1; i <= 50; i+=2 )
            System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100;
        colocar un asterisco a la derecha de aquellos numeros
        que son multiplo de 10*/
        System.out.println("************");
        //forma 1: usando estructuras convencionales
        for( int i = 1; i <= 100; i++ )
        {
            System.out.print(i);
            if( i%10 == 0 )
                System.out.println("*");
            else
                System.out.println("");
        }
        //forma 2: usando operador ternario
        for( int i = 1; i <= 100; i++ )
            System.out.println( i+( i%10 == 0 ? "*": "" ) );
        /*6) imprimir los numeros del 10 al 1,
        de forma descendente de uno en uno*/
        System.out.println("******");
        for( int i = 10; i >= 1; i-- )
            System.out.println(i);
        /*7) imprimir los numeros del 10 al 0, de forma
        descendente de dos en dos*/
        System.out.println("******");
        for( int i = 10; i >= 0; i-=2 )
            System.out.println(i);
        /*8) imprimir los numeros del 100 al 0,
        de forma descendente de diez en diez*/
        System.out.println("******");
        for( int i = 100; i >= 0; i-=10 )
            System.out.println(i);
    }    
}
