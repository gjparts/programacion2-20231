package while01;

public class While01 {
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        // usando while
        //variable de control:
        int n = 1;
        while( n <= 10 )
        {
            System.out.println(n);
            //modificar la variable de control
            n++;    //sumar 1 a n
        }
        System.out.println("**************");
        /*2) imprimir los numeros del 0 al 20 de dos en dos
        (hay  mas de una forma de hacerlo)*/
        n = 0;
        while( n <= 20 )
        {
            System.out.println(n);
            //modificar la variable de control
            n += 2;
        }
        //forma 2:
        n = 0;
        while( n <= 20 )
        {
            if( n%2 == 0 )
                System.out.println(n);
            
            //modificar la variable de control
            n++;
        }
    }    
}
