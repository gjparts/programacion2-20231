/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test456;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Test456 {
/*
    Hacer un programa que pregunte el nombre de una persona y su estado civil.
    Para el estado civil solo se aceptará los valores char siguientes:
    
    S	Soltero
    C	Casado
    V	Viudo
    D	Divorciado
    U	Union Libre

    Si digita un valor no aceptado para el estado civil entonces mostrar
    un mensaje indicándolo, de lo contrario mostrar el mensaje:

    informacion digitada es correcta*/
    public static void main(String[] args) {
        //variables
        Scanner s = new Scanner(System.in);
        String nombre;
        char estado;
        //leer
        System.out.print("Digitar el nombre de la persona: ");
        nombre = s.nextLine();
        System.out.println("Digitar el estado civil, usar las letras siguientes:");
        System.out.println("S\tSoltero\nC\tCasado\nV\tViudo\nD\tDivorciado\nU\tUnion Libre");
        estado = s.next().charAt(0);
        //procesamiento y salida
        if( estado == 'C' || estado == 'S' || estado == 'V' || estado == 'D' || estado == 'U' )
            System.out.println("informacion digitada es correcta");
        else
            System.out.println("Estado civil no valido.");
    }
    
}
