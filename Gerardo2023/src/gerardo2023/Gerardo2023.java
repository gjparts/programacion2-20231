/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo2023;

/**
 *
 * @author Gerardo
 */
public class Gerardo2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola UNAH");
        System.out.println("Un gusto");
        System.out.println("Bienvenidos");
        System.out.print("Letra A");
        System.out.print("Letra X");
        System.out.println("");
        System.out.print("Letra R");
        System.out.println("Gerardo\nPorti\nllo");
        System.out.println("Nombre\tColor");
        System.out.println("Lapiz\tVerde");
        System.out.println("Vaso\tRojo");
        
        //declarar variables
        int a;
        int b = 12;
        int c,d = 5,e;
        double cifra1 = 3.2, cifra2, cifra3 = 4;
        double numX = 6;
        double x1;
        
        float fX1 = 5, fX2 = 3.6f;
        float f1, f2;
        float fZ;
        
        char ch1 = 'f';
        boolean disponible = false;
        
        String palabra1;
        String oracion1 = "hola UNAH";
        
        double n1 = 5, n2 = 3, n3 = 2;
        double n4 = 3, n5 = 9;
        double resultado = (n1+n2)/n3;
        System.out.println("primer resultado "+resultado);
        resultado = ((n1+n2*n3)/2+n4)*n5;
        System.out.println("segiundo resultado "+resultado);
        
        //raiz cuadrada
        double nn1 = 25;
        double raiz = Math.sqrt(nn1);
        System.out.println("La raiz de "+nn1+" es "+raiz);
        
        //elevar un numero a determinada potencia
        //por ejemplo elevar nn2 a la cuarta potencia
        double nn2 = 7;
        System.out.println(nn2+" elevado a la 4 potencia es "+Math.pow(nn2, 4));
        
        //otra forma de hacer el ejemplo anterior
        double nn3 = 7;
        double eleva = Math.pow(nn3, 4);
        System.out.println(nn3+" elevado a la 4 potencia es "+eleva);
        
        //hacer calculos a la hora de imprimir
        float x = 5.2f, y = 4.8f;
        System.out.println("La suma de "+x+" mas "+y+" es "+(x+y));
    }
    
}
