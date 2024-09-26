public class Decisiones {

    public static void main(String[] args) {

        int fechaDeLanzamiento = 2023;
        boolean incluidoEnPlan = true;
        double calificacion=9.8;

        String plan = "Plus";

        if ( fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }else{
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        if (incluidoEnPlan || plan.equals("Plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible en su plan");
        }

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }
    }
}
