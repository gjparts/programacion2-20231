package cadenas0015;

public class Cadenas0015 {

    public static void main(String[] args) {
        //uso de la funcion split: genera un Arreglo de String en base
        //a un token que separa diversos elementos.
        String texto = "Pera,Gato,Cueva,Oxidado,Agua,Nube,Comida,Fuego,Pure de papa,Ajo";
        //declarar un arreglo de String para depositar los elementos
        //de la cadena anterior
        String arreglo[];
        
        //llenar el arreglo anterior con los elementos del
        //String separado por comas
        arreglo = texto.split(",");
        
        //imprimir todos los elementos del arreglo
        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println("posicion "+i+", valor: "+arreglo[i]);
        }
        System.out.println("La cadena de texto tiene "+arreglo.length+" elementos");
    }
    
}
