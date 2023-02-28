package cadenas0001;

public class Cadenas0001 {

    public static void main(String[] args) {
        //String, es una clase que permite crear objetos
        String cadena1;
        String cadena2 = "Gerardo";
        String cadena3, cadena4 = "Portillo", cadena5;
        System.out.println("contenido de cadena1 "+cadena2);
        //crear una cadena a partir de dos cadenas
        String unir;
        unir = cadena2+" "+cadena4;
        System.out.println(unir);
        cadena2 = "Filomeno";
        System.out.println(unir);
        
        unir = cadena2+" "+cadena4;
        System.out.println(unir);
        
        String cadenax = "la suma de 2+2 es "+(2+2);
        System.out.println(cadenax);
    }
    
}
