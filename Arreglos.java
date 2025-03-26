
import java.util.Scanner;

public class Arreglos {

    public static int t = 25; //tamaño maximo del grupo 

    public static double [] leercalificaciones(double[]calificaciones){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<calificaciones.length; i++){
            System.out.println("Escribe calificaciones[" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        return calificaciones;

    }

    public static void imprimirCalificaciones(double [] calificaciones){
        for( double calificacion : calificaciones)
        System.out.println(calificacion);

    }

    public static void evaluarcalificaciones(){

    }
    public static void main(String[] args) {
        double[] parcial1, parcial2, parcial3, parcial4; //declarar los arreglos
        double[] Promedio;
        boolean[] Aprobados;
        Scanner  sc = new Scanner(System.in);
        System.out.println("Programa que calcula el promedio final de un grupo ");
        System.out.println("Escribe el tamaño del grupo: ");
        t = sc.nextInt();

        //inicialisar los arreglos
        parcial1 = new double[t];
        parcial2 = new double[t];
        parcial3 = new double[t];
        parcial4 = new double[t];
        Promedio = new double[t];
        Aprobados = new boolean[t];

        // Leer las calificaciones de los parciales de cada alumno 

            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 1 " );
            parcial1 = leercalificaciones(parcial1);
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 2 " );
            parcial2 = leercalificaciones(parcial2);
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 3 " );
            parcial3 = leercalificaciones(parcial3);
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 4 " );
            parcial4 = leercalificaciones(parcial4);

            //mostrar calificaciones de los parciales 
            System.out.println("----------------------------------------------");
            System.out.println("calificaciones del parcial 1 " );
            imprimirCalificaciones(parcial1);
            System.out.println("----------------------------------------------");
            System.out.println("calificaciones del parcial 2 " );
            imprimirCalificaciones(parcial2);
            System.out.println("----------------------------------------------");
            System.out.println("calificaciones del parcial 3 " );
            imprimirCalificaciones(parcial3);
            System.out.println("----------------------------------------------");
            System.out.println("calificaciones del parcial 4 " );
            imprimirCalificaciones(parcial4);




        sc.close();
    }
}