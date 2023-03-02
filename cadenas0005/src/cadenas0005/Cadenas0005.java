package cadenas0005;

public class Cadenas0005 {

    public static void main(String[] args) {
        //conversiones
        //convertir de tipo int a tipo String
        int entero1 = 123;
        String cadena1;
        //si intenta almacenar un int en un String no lo dejará:
        //cadena1 = entero1;
        //para convertir un entero a String:
        cadena1 = String.valueOf(entero1);
        System.out.println("entero1: "+entero1+"\tcadena1: "+cadena1);
        
        //convertir de tipo double a tipo String
        double d1 = 3.1416;
        String cadena2 = String.valueOf(d1);
        System.out.println("d1: "+d1+"\tcadena2: "+cadena2);
        
        //convertir de tipo float a tipo String
        float f1 = 9.8f;
        String cadena3 = String.valueOf(f1);
        System.out.println("f1: "+f1+"\tcadena3: "+cadena3);
        
        String cadenax = "3";        
        //convertir de String a entero
        int entero2 = Integer.parseInt(cadenax);
        System.out.println("cadenax: "+cadenax+"\tentero2: "+entero2);
        
        String cadenax2 = "3.98452";
        //convertir de String a double
        double d2 = Double.parseDouble(cadenax2);
        System.out.println("cadenax2: "+cadenax2+"\td2: "+d2);
        
        //convertir de String a float
        float f2 = Float.parseFloat(cadenax2);
        System.out.println("cadenax2: "+cadenax2+"\tf2: "+f2);
    }
    
}
