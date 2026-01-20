public class MainMascota {
    public static void main(String[] args) {
        //Crea una clase Mascota con los atributos nombre y hambre.
        // El valor de hambre debe estar entre 0 y 100.
        // Implementa un constructor que inicialice la mascota.
        // Añade un método comer que reduzca el hambre y otro método pasarTiempo que la aumente;
        //  por ejemplo, cada vez que come se reduce su hambre en 25, y por cada hora que pasa se aumenta su hambre en 5.
        //  Añade un método mostrarEstado que muestre el nombre y el nivel de hambre. Desde el main,
        //   simula el paso del tiempo y la alimentación de la mascota.

        Mascota animal=new Mascota(75,"Pancho");

        System.out.println("");

        animal.mostrarEstado();
        System.out.println("le daremos de comer a " + animal.getNombre());

        animal.reducirHambre();
        animal.mostrarEstado();
        System.out.println("ha pasado 10 horas y " + animal.getNombre() + " tiene hambre ");
        animal.pasarTiempo(10);
        animal.mostrarEstado();


    }
}
