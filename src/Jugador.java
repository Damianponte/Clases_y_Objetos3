public class Jugador {
    //Crea una clase Jugador con los atributos nombre y experiencia.
    // Implementa un constructor que inicialice ambos valores.
    // Añade un método ganarExperiencia que sume puntos de experiencia.
    //  Añade un método mostrarNivel que calcule y muestre el nivel del jugador sabiendo que cada 100 puntos de experiencia se sube un nivel.
    // Desde el main, prueba a ganar experiencia varias veces.

    private String nombre;
    private int exp;


    public Jugador(String nombre, int exp) {
        this.nombre = nombre;
        this.exp = exp;
    }


    public String getNombre() {
        return nombre;
    }

    public int getExp() {
        return exp;
    }
    public void ganarExperiencia(int aumentoExperiencia){
        exp=exp+ aumentoExperiencia;

    }
    public void mostrarNivel() {
        int nivel = (exp / 100) + 1;
        System.out.println(nombre + " tiene " + exp +
                " puntos de experiencia y está en el nivel " + nivel);
    }
    public int getNivel(){
        return exp / 100 + 1;
    }
}
