

    //Crea una clase "Luchador"; tiene que tener un nombre, vida, ataque y defensa.
    // Para todos los métodos tienes que generar getters, pero no setters:
    // una vez que creamos un objeto, no podemos sobreescribir su estado/atributos directamente.
    //
    //El objetivo es simular peleas. Para ello,
    // cada luchador tiene un método "ataca()" que devuelve cuando daño hace, y un método "recibeDanho(int danhoRecibido)" que:
    //acepta un entero
    //internamente calcula el daño recibido restándole su defensa a dicho daño
    //resta a su vida dicho daño
    //devuelve "true" si el luchador es derrotado, o "false" si no es derrotado.
    //Ten en cuenta que en los métodos tendrás que hacer las comprobaciones necesarias; por ejemplo,
    // si la defensa de un jugador es 50 y recibe 10 de daño, no tiene que hacerse "(10 - 50)" puntos de daño, ya que eso le curaría.
    //
    //En el main, simula una pelea entre dos luchadores, en los que toman turnos para atacarse.

    public class Luchador {

        private String nombre;
        private int vida;
        private int ataque;
        private int defensa;

        public Luchador(String nombre, int vida, int ataque, int defensa) {
            this.nombre = nombre;
            this.vida = vida;
            this.ataque = ataque;
            this.defensa = defensa;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public int getVida() {
            return vida;
        }

        public int getAtaque() {
            return ataque;
        }

        public int getDefensa() {
            return defensa;
        }


        public int ataca() {
            return ataque;
        }


        public boolean recibeDanho(int danhoRecibido) {
            int danhoReal = danhoRecibido - defensa;

            if (danhoReal < 0) {
                danhoReal = 0;
            }

            vida -= danhoReal;

            if (vida < 0) {
                vida = 0;
            }

            return vida == 0;
        }
    }