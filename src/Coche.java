public class Coche {
    //Crea una clase Coche con los atributos marca, velocidad y velocidadMaxima.
    // Implementa un constructor para inicializar la marca, la velocidad máxima y empezar con velocidad cero.
    // Añade un método acelerar que aumente la velocidad y otro frenar que la reduzca.
    //  La velocidad nunca puede ser menor que cero ni mayor que la máxima.
    //  Añade un método mostrarVelocidad. Desde el main, crea un coche y simula varios cambios de velocidad.

   private String nombreMarca;
   private int velocidad;
   private int velocidadMaxixma;

    public Coche(String nombreMarca) {
        this.nombreMarca = nombreMarca;
        this.velocidad = 0;
        this.velocidadMaxixma = 100;


    }
    public void acelerar(int incremento){
        velocidad =velocidad +  incremento;
        if (velocidad > velocidadMaxixma) {
            velocidad = velocidadMaxixma;
        }

    }
    public void desacelerar(int decremento){
        velocidad =velocidad -  decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVelocidadMaxixma() {
        return velocidadMaxixma;
    }

    public void mostrarVelocidad(){
        System.out.println(" la velocidad actual del " + getNombreMarca() + " es: " + getVelocidad() + " km");
    }
}
