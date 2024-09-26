import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio ;

        Scanner adivinanza = new Scanner(System.in);
        int numeroAdivinado ;
        int numeroDeintentos = 5;

        for (int i = 1; i<=numeroDeintentos; i++){

            numeroAleatorio = random.nextInt(101);
            System.out.println("Adivina el nuemro que esta pensando la computadora entre 0 al 100");
            numeroAdivinado = adivinanza.nextInt();

            if(numeroAleatorio == numeroAdivinado ){
                System.out.println("felicidades adivinaste");
                break;
            }else{
                System.out.println("sigue intentandolo el numero correcto es :"+ numeroAleatorio);
                if(i == 5){
                    System.out.println("Pediste");
                }
            }

        }

        System.out.println("Fin del juego");
        adivinanza.close();
    }
}
