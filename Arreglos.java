
import java.util.Scanner;

public class Arreglos {

    public static int t = 25; //tamaño maximo del grupo 

    public static double [] leercalificaciones(){
        double[] calificaciones = new double[t];
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
    public static double[] obtenerPromedio(double[] p1, double[] p2, double[] p3, double[] p4){
        double[] resultado = new double[t];
        for ( int i=0; i<resultado.length; i++)
            resultado[i] = (p1[i] + p2[i] + p3[i] + p4[i])/4;
        return resultado;
    }

    public static boolean [] evaluarcalificaciones(double[] prom){
        boolean[] resultado = new boolean[t];
        for(int i=0; i<prom.length; i++){
            if(prom[i] >= 7)
            resultado[i] = true;
            else
            resultado[i] = false;
        }
        return resultado;

    }
    public static void imprimirResultados(boolean[] resultados){
        for( boolean resultado : resultados)
        System.out.println(resultado);
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
            parcial1 = leercalificaciones();
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 2 " );
            parcial2 = leercalificaciones();
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 3 " );
            parcial3 = leercalificaciones();
            System.out.println("----------------------------------------------");
            System.out.println("lectura de calificaciones del parcial 4 " );
            parcial4 = leercalificaciones();
            //calcular cada promedio indivial
            Promedio = obtenerPromedio(parcial1, parcial2, parcial3, parcial4);
            //evaluar  calificaciones de aprovados
            Aprobados = evaluarcalificaciones(Promedio);

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
            System.out.println("Promedio individual" );
            imprimirCalificaciones(Promedio);
            System.out.println("Aprobados" );
            imprimirResultados(Aprobados);

        sc.close();
    }
}