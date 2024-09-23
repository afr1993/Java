public class CovertidorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 20.0;

        double temperaturaFaranheit = (temperaturaCelsius * 1.8) + 32;

        int temperaturaFaranheitSinDecimal = (int) temperaturaFaranheit;

        System.out.println("La temperatura en celsius es :"+temperaturaCelsius+"\n"+
                "Temperatura en faranheit es :"+ temperaturaFaranheit+"\n"+
                "temperatura en faranheit sin decimales es : "+temperaturaFaranheitSinDecimal);
    }
}
