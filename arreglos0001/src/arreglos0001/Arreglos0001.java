package arreglos0001;

public class Arreglos0001 {

    public static void main(String[] args) {
        //Arreglos Unidimensionales
        //hay dos formas de declarar arreglos:
        //Forma 1: Declarar un arreglo vacio
        //crear un arreglo unidimensional de numeros enteros de tamaño 6 sin valores de inicio
        int arreglo[] = new int[6];
        //poner valores a cada
        arreglo[0] = 5;
        arreglo[1] = 8;
        arreglo[2] = 7;
        arreglo[3] = 100;
        arreglo[4] = 78;
        arreglo[5] = 201;
        //imprimir un elemento del arreglo
        System.out.println("Elemento 0 o sea el primer elememto: "+arreglo[0]);
        System.out.println("Elemento 3 o sea el cuarto elememto: "+arreglo[3]);
        System.out.println("Ultimo elemento: "+arreglo[5]);
        //otra forma de imprimir el ultimo elemento
        System.out.println("Ultimo elemento: "+arreglo[ arreglo.length-1 ]);
        //sobrescribir valores del arreglo
        arreglo[0] = 777;
        System.out.println("Elemento 0 o sea el primer elememto: "+arreglo[0]);
        
        //Forma 2: declarar el arreglo prellenado
        int arreglo2[] = { 11, 45, 32, 84, 120, 37, 1, 80, 555 };
        System.out.println("Tamaño de arreglo2: "+arreglo2.length);
        //imprimir un elemento del arreglo
        System.out.println("Elemento 0 del arreglo2: "+arreglo2[0]);
        System.out.println("Ultimo elemento del arreglo2: "+arreglo2[ arreglo2.length-1 ]);
        
        //arreglo de double
        //declarar un arreglo unidimensional de numeros double de 7 posiciones vacio
        double arrdouble[] = new double[7];
        System.out.println( "elemento 4 de arrdouble: "+arrdouble[4] );
        
        //declarar nu arreglo unidimensional prellenado de numeros double de 4 posiciones
        double arrdouble2[] = { 3.14, 5.25, 4.16, 1.11 };
        System.out.println( "elemento 1 de arrdouble2: "+arrdouble2[1] );
        
        //arreglo de float
        //declarar nu arreglo unidimensional de numeros float de 4 posiciones, vacio
        float arrfloat[] = new float[4];
        System.out.println( "elemento 2 de arrfloat: "+arrfloat[2] );
        
        //declarar nu arreglo unidimensional prellenado de numeros float de 4 posiciones
        float arrfloat2[] = { 3.1416f, 6.78f, 9.11f, 3.11f };
        System.out.println( "elemento 0 de arrfloat2: "+arrfloat2[0] );
        
    }
    
}
