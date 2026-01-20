public class MainTermometro {
    public static void main(String[] args) {

        Termometro termometro1= new Termometro(25);

        System.out.println("la temperatura actual es " + termometro1.getTemperaturaInicial());
        termometro1.aumentarTemperatura(15);
        System.out.println("ha subido la temperatura ");

        termometro1.MostrarTemperatura();
        System.out.println("ha subido la temperatura ");
        termometro1.aumentarTemperatura(15);
        termometro1.MostrarTemperatura();

        System.out.println("ha bajado la temperatura ");
        termometro1.decrementarTemperatura(75);
        termometro1.MostrarTemperatura();

        termometro1.decrementarTemperatura(75);
        termometro1.MostrarTemperatura();


    }
}
