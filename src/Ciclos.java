import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double califciacion = 0;
        double mediaCalificacion = 0;

        for (int i = 0; i < 3 ; i++){

            System.out.println("Escribe la calificacion le daras a la pelicula");
            califciacion = teclado.nextDouble();
            mediaCalificacion = mediaCalificacion + califciacion;
        }
        mediaCalificacion = mediaCalificacion/3;

        System.out.println("La califcacion promedio de la pelicula es: "+mediaCalificacion);
    }
}
