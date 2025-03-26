
import java.util.Scanner;

public class Arreglos {

    public static int T = 25; //tamaño maximo del grupo 

    public static void leercalificaciones(){


    }

    public static void evaluarcalificaciones(){

    }
    public static void main(String[] args) {
        double[] Parcial1, Parcial2, Parcial3, Parcial4; //declarar los arreglos
        double[] Promedio;
        boolean[] Aprobados; 
        double[] calificaciones = new double[5]; // declarando y construllendo el arreglo
        Scanner  sc = new Scanner(System.in);
        for (int i = 0; i<calificaciones.length; i++){
            System.out.println("Escribe calificaciones[" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        //No se imprime el contenido de todas las casillas del arreglo solo se imprime la direccion 
        //de memoria donde empieza el arreglo
        //System.out.println("Calificaciones: " + calificaciones);
        
        //imprecion usando el for extendido
        System.out.println("Contenido del arreglo calificaciones: z");
        for( double calificacion : calificaciones)
            System.out.println(calificacion);
        System.out.println("Contenido de calificaciones: ");
        // Impresion con el for tradicional
        for ( int i=0; i<calificaciones.length; i++)
        System.out.println(calificaciones[i]);
        
        sc.close();
    }
}