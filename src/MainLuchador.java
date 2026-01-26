////Crea una clase "Luchador"; tiene que tener un nombre, vida, ataque y defensa.
//  Para todos los métodos tienes que generar getters, pero no setters:
//  una vez que creamos un objeto, no podemos sobreescribir su estado/atributos directamente.
// El objetivo es simular peleas. Para ello,
// cada luchador tiene un método "ataca()" que devuelve cuando daño hace, y un método "recibeDanho(int danhoRecibido)" que:
// acepta un entero
// internamente calcula el daño recibido restándole su defensa a dicho daño
// resta a su vida dicho daño
// devuelve "true" si el luchador es derrotado, o "false" si no es derrotado.
// Ten en cuenta que en los métodos tendrás que hacer las comprobaciones necesarias; por ejemplo,
//  si la defensa de un jugador es 50 y recibe 10 de daño, no tiene que hacerse "(10 - 50)" puntos de daño, ya que eso le curaría.
// En el main, simula una pelea entre dos luchadores, en los que toman turnos para atacarse.


public class MainLuchador {
    public static void main(String[] args) {

        Luchador[] persona = new Luchador[2];
        persona[0] = new Luchador("Ryu", 100, 25, 10);
        persona[1] = new Luchador("Ken", 100, 25, 10);

        while (persona[0].getVida() > 0 && persona[1].getVida() > 0) {

            System.out.println(persona[0].getNombre() + " ataca a " + persona[1].getNombre());
            boolean derrotado = persona[1].recibeDanho(persona[0].ataca());
            System.out.println("Vida de " + persona[1].getNombre() + ": " + persona[1].getVida());

            if (derrotado) {
                System.out.println(persona[1].getNombre() + " ha sido derrotado ");
                break;
            }

            System.out.println();

            System.out.println(persona[1].getNombre() + " ataca a " + persona[0].getNombre());
            derrotado = persona[0].recibeDanho(persona[1].ataca());
            System.out.println("Vida de " + persona[0].getNombre() + ": " + persona[0].getVida());

            if (derrotado) {
                System.out.println(persona[0].getNombre() + " ha sido derrotado ");
                break;
            }

           
        }
    }
}