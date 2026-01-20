public class MainCoche {
    public static void main(String[] args) {

        //Crea una clase Coche con los atributos marca, velocidad y velocidadMaxima.
        // Implementa un constructor para inicializar la marca, la velocidad máxima y empezar con velocidad cero.
        // Añade un método acelerar que aumente la velocidad y otro frenar que la reduzca.
        //  La velocidad nunca puede ser menor que cero ni mayor que la máxima.
        //  Añade un método mostrarVelocidad. Desde el main, crea un coche y simula varios cambios de velocidad.

        Coche vehiculo1=new Coche("BMW");
        Coche vehiculo3=new Coche("BMW",150);

        System.out.println("el " + vehiculo1.getNombreMarca() + " tiene una velocidad de " + vehiculo1.getVelocidad());

        vehiculo1.acelerar(25);

        System.out.println("el " + vehiculo1.getNombreMarca() + " tiene una velocidad de " + vehiculo1.getVelocidad());

        vehiculo1.acelerar(45);
        System.out.println("el " + vehiculo1.getNombreMarca() + " tiene una velocidad de "+ vehiculo1.getVelocidad());

        vehiculo1.desacelerar(25);

        vehiculo1.mostrarVelocidad();

    }
}
