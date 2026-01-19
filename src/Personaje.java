public class Personaje {
    //Crea una clase llamada Personaje con los atributos nombre y vida.
    // Implementa un constructor para inicializar estos datos.
    // Añade un método recibirDanho que reste puntos de vida y un método curarse que los aumente.
    //  La vida nunca puede ser menor que 0 ni mayor que 100.
    //  Añade un método mostrarEstado que imprima el nombre y la vida actual.
    // Desde el main, crea un personaje y simula varios ataques y curaciones.

    private String NombrePersonaje;
    private int vida;

    public Personaje(String nombrePersonaje, int vida) {
        NombrePersonaje = nombrePersonaje;
        this.vida = 100;
    }

    public String getNombrePersonaje() {
        return NombrePersonaje;
    }

    public int getVida() {
        return vida;
    }

    public void  recibirDanho(int danho){
        vida=vida-danho;

        if(vida<=0){
            vida=0;

        }

    }
    public void curarse(int curar){
        vida =vida + curar;
        if (vida>=100){
            vida=100;
        }

    }
    public void mostrarEstado(){
        System.out.println(getNombrePersonaje() + "tiene " + getVida() + " de vida");

    }
}


