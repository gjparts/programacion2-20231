/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch01;

import java.util.Scanner;
public class Switch01 {

    public static void main(String[] args) {
        //variables
        Scanner s = new Scanner(System.in);
        int numero;
        //leer
        System.out.print("Digite un numeto entre 1 y 5: ");
        numero = s.nextInt();
        
        switch(numero){
            case 1:
                System.out.println("Ha digitado el numero Uno");
            break;
            case 2:
                System.out.print("Ha digitado ");
                System.out.println("el numero Dos");
            break;
            case 3:
                System.out.println("Ha digitado el numero Tres");
            break;
            case 4:
                System.out.println("Ha digitado el numero Cuatro");
            break;
            case 5:
                System.out.println("Ha digitado el numero Cinco");
            break;
            default:
                System.out.println("Numero no valido");
        };
    }
    
}
