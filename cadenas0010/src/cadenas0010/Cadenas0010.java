package cadenas0010;
import java.util.Scanner;
public class Cadenas0010 {

    public static void main(String[] args) {
        String contrato = "CONTRATO DE ARRENDAMIENTO CON OPCION A COMPRA\n";
        contrato += "Nosotros, PRESTAMOS S.A. de este domicilio, actuando como\n";
        contrato += "sociedad mercantil con RTN 12341234123456 convenimos con [Cliente]\n";
        contrato += "mayor de edad, [EstadoCivil], [Profesional], de este domicilio con\n";
        contrato += "identidad [Cedula] hemos convenido en celebrar un Contrato\n";
        contrato += "de Arrendamiento con opción a Compra sobre un vehículo.\n\n\n\n";
        contrato += "---------------------------------\n";
        contrato += "Firma de [Cliente]";
        
        Scanner s = new Scanner(System.in);
        String cliente, estadoCivil, Profesion, Cedula;
        System.out.print("Digite nombre del cliente: ");
        cliente = s.nextLine();
        System.out.print("Digite estado civil del cliente: ");
        estadoCivil = s.nextLine();
        System.out.print("Digite profesión del cliente: ");
        Profesion = s.nextLine();
        System.out.print("Digite identidad del cliente: ");
        Cedula = s.nextLine();
        
        //hacer los respectivos reemplazos en el contrato
        contrato = contrato.replace("[Cliente]", cliente);
        contrato = contrato.replace("[EstadoCivil]", estadoCivil);
        contrato = contrato.replace("[Profesional]", Profesion);
        contrato = contrato.replace("[Cedula]", Cedula);
        System.out.println(contrato);
        
        //forma 2 de reemplazar
        /*
        contrato = contrato.replace("[Cliente]", cliente).replace("[EstadoCivil]", estadoCivil).replace("[Profesional]", Profesion).replace("[Cedula]", Cedula);
        System.out.println(contrato);
        */
    }
    
}
