public class Termometro {
    //Crea una clase Termometro con un atributo temperatura.
    // Implementa un constructor que reciba la temperatura inicial.
    // Añade métodos para subir y bajar la temperatura.
    // No se permite que la temperatura baje de −50 grados ni que supere los 50 grados.
    // Añade un método que muestre la temperatura actual. Desde el main, prueba distintas variaciones.

        private double temperatura;
        private double temperaturaInicial;


    public Termometro(double temperatura,double temperaturaInicial) {
        this.temperatura = temperatura;
        this.temperaturaInicial=temperaturaInicial;
    }

    public void aumentarTemperatura(double aumento){


        temperatura=temperaturaInicial+aumento;
        if(temperatura>50){
            temperatura=50;
        }
    }
    public void decrementarTemperatura(double decremento){
        temperatura=temperaturaInicial- decremento;

        if (temperatura<-50){
            temperatura=-50;
        }

    }

    public void MostrarTemperatura(){
        System.out.println(" la temperatura actual del es " + getTemperatura() + " grados");
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTemperaturaInicial() {
        return temperaturaInicial;
    }
}
