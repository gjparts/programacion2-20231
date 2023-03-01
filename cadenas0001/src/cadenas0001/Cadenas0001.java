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
        
        String cadenax = "La Suma de 2+2 es "+(2+2);
        System.out.println(cadenax);
        
        //tamaño de una cadena de texto
        System.out.println("La cadena de texto tiene: "+unir.length() );
        //almacenar el tamaño de una cadena de un variable
        int t = cadenax.length();
        System.out.println("El valor almacenado en t es "+t);
        
        //obtener una version en mayusculas de una cadena de texto
        //cadenax = cadenax.toUpperCase();
        System.out.println("Version en mayusculas de cadenax: "+cadenax.toUpperCase());
        System.out.println("imprimir cadenax: "+cadenax);
        
        //obtener una version en minusculas de una cadena de texto
        System.out.println("Version en minusculas de cadenax: "+cadenax.toLowerCase());
        System.out.println("imprimir cadenax: "+cadenax);
        
        //eliminar los espacios iniciales y finales en una cadena
        String str1 = "     Hola solo soy una      cadena de texto      ";
        //trim devuelve una version sin relleno de espacios de la cadena
        //str1 = str1.trim(); //afectar a str1
        System.out.println("Version trim de str1: "+str1.trim());
        System.out.println("imprimir str1: "+str1);
        
        //desencadenar varias funciones de cadena
        //quiero una copia de str1 en mayusculas y sin relleno de espacios
        String copia_str1;
        copia_str1 = str1.toUpperCase().trim();
        System.out.println("Copia de str1 en mayusculas y sin relleno de espacios: "+copia_str1); 
        
        //tamaño de una cadena de texto con y sin relleno
        System.out.println("Tamaño de str1 con relleno: "+str1.length() );
        System.out.println("Tamaño de str1 sin relleno: "+str1.trim().length() );
        
        
    }
    
}
