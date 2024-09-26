import java.util.Scanner;

public class LecturaDeDatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula Favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Escibre su fecha de lanzmiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Califica la pelicula");

        double calificaion = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(calificaion);
    }
}
