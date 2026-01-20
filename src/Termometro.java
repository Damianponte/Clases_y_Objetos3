public class Termometro {
    //Crea una clase Termometro con un atributo temperatura.
    // Implementa un constructor que reciba la temperatura inicial.
    // Añade métodos para subir y bajar la temperatura.
    // No se permite que la temperatura baje de −50 grados ni que supere los 50 grados.
    // Añade un método que muestre la temperatura actual. Desde el main, prueba distintas variaciones.


        private double temperaturaInicial;


    public Termometro(double temperaturaInicial) {

        this.temperaturaInicial=temperaturaInicial;
    }

    public void aumentarTemperatura(double aumento){


        temperaturaInicial=temperaturaInicial+aumento;
        if(temperaturaInicial>50){
            temperaturaInicial=50;
            System.out.println ("Esta es la temperatura maxima");
        }
    }
    public void decrementarTemperatura(double decremento){
        temperaturaInicial=temperaturaInicial- decremento;

        if (temperaturaInicial<-50){
            temperaturaInicial=-50;
            System.out.println ("Esta es la temperatura minima");
        }

    }

    public void MostrarTemperatura(){
        System.out.println(" la temperatura actual del es " + getTemperaturaInicial() + " grados");
    }



    public double getTemperaturaInicial() {
        return temperaturaInicial;
    }
}
