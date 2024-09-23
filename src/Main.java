//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Sreen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double calificacion=9.8;

        double media = (9.8+6.0+8.7)/3;

        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milienio
                Fue lanzada en :
                """+ fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println(clasificacion);
    }
}