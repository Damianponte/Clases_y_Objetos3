import java.util.Scanner;

public class MainPersonaje {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Personaje personaje1 = new Personaje("Damian", 100);
        int opcion = -1;

        while (opcion != 0 || personaje1.getVida()>0) {
            System.out.println("\nEl jugador " + personaje1.getNombrePersonaje() + " tiene " + personaje1.getVida() + " de vida.");

            System.out.println("¡Han herido a " + personaje1.getNombrePersonaje() + "!");
            System.out.print("¿Cuánto daño ha recibido? ");
            int danho = entrada.nextInt();
            personaje1.recibirDanho(danho);

            System.out.println("El jugador " + personaje1.getNombrePersonaje() + " ahora tiene " + personaje1.getVida() + " de vida.");

            System.out.println("\nEl jugador " + personaje1.getNombrePersonaje() + "quiere usar  un objeto de curación.");
            System.out.println("¿Qué debería usar?");
            System.out.println("1. Poción de 25 puntos");
            System.out.println("2. Poción de 50 puntos");
            System.out.println("3. Poción de 100 puntos");
            System.out.println("0. No usar poción / salir");

            opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("ha usado una pocion de recuperacion de 25 puntos");
                personaje1.curarse(25);
                System.out.println("el jugador " + personaje1.getNombrePersonaje() + " tiene " + personaje1.getVida() + " de vida");
            } else if (opcion == 2) {
                System.out.println("ha usado una pocion de recuperacion de 50 puntos");
                personaje1.curarse(50);
                System.out.println("el jugador " + personaje1.getNombrePersonaje() + " tiene " + personaje1.getVida() + " de vida");
            } else if (opcion == 3) {
                System.out.println("ha usado una pocion de recuperacion de 100 puntos");
                personaje1.curarse(100);
                System.out.println("el jugador " + personaje1.getNombrePersonaje() + " tiene " + personaje1.getVida() + " de vida");
            } else {
                System.out.println("No has usado una  pocion de recuperacion ");
            }
        }

    }
}
