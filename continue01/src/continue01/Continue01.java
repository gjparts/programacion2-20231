package continue01;

public class Continue01 {

    public static void main(String[] args) {
        /*USANDO LA INSTRUCCION CONTINUE
        Hacer un programa que imprima los numeros del 1 al 100; pero no imprimir
        aquellos numeros que sean multiplos de 5.*/
        for( int i = 1; i <= 100; i++ )
        {
            //si es multiplo de 5, saltarselo
            if( i%5 == 0 )
                continue;
            
            System.out.println(i);
        }
    }
    
}
