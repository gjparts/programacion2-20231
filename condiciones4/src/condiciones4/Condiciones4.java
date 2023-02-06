package condiciones4;

import java.util.Scanner;
public class Condiciones4 {

    public static void main(String[] args) {
        /*PROBLEMAS DE CLASE
        Hacer un programa que pregunte el salario mensual de un empleado
        y su antiguedad en años.
        El programa devolverá el bono anual obtenido de
        multiplicar el salario mensual por el % de bono el cual
        sale de la tabla siguiente:

        Antigüedad			% bono
        menos de 5 años			10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%
        */
        //declaracion de variables
        Scanner s = new Scanner(System.in);
        double salario, bono = 0;
        int antiguedad;
        //entrada de datos
        System.out.print("Digitar el salario mensual:");
        salario = s.nextDouble();
        System.out.print("Digitar la antigüedad en años: ");
        antiguedad = s.nextInt();
        //procesamiento
        if( antiguedad < 5 )
            bono = salario*0.10;
        if( antiguedad >= 5 && antiguedad < 10 )
            bono = salario*0.15;
        if( antiguedad >= 10 && antiguedad < 20 )
            bono = salario*0.20;
        if( antiguedad >= 20 )
            bono = salario*0.25;
        //salida
        System.out.println("El bono sera de "+bono);
    }
    
}
