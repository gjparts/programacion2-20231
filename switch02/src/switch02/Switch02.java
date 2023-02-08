
package switch02;

import java.util.Scanner;
public class Switch02 {

    public static void main(String[] args) {
        /*pedir mes y año y mostrar cuantos dias tiene dicho mes/año
        desarrollarlo utilizando una estructura switch*/
        //variables y entradas
        Scanner s = new Scanner(System.in);
        int mes, anio;
        System.out.print("Digitar el mes: ");
        mes = s.nextInt();
        System.out.print("Digitar el año: ");
        anio = s.nextInt();
        //procesamiento
        switch(mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("El mes tiene 31 dias.");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("El mes tiene 30 dias.");
            break;
            case 2:
                //febrero puede tener 28/29 depende si es biciesto el año
                if( anio%4 == 0 )
                    System.out.println("El mes tiene 29 dias.");
                else
                    System.out.println("El mes tiene 28 dias.");
            break;
            default:
                System.out.println("Mes no valido.");
        };
    }
    
}
