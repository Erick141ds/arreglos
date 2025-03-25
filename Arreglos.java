
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        double[] calificaciones = new double[5];
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