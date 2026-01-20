public class Mascota {
    //Crea una clase Mascota con los atributos nombre y hambre.
    // El valor de hambre debe estar entre 0 y 100.
    // Implementa un constructor que inicialice la mascota.
    // Añade un método comer que reduzca el hambre y otro método pasarTiempo que la aumente;
    //  por ejemplo, cada vez que come se reduce su hambre en 25, y por cada hora que pasa se aumenta su hambre en 5.
    //  Añade un método mostrarEstado que muestre el nombre y el nivel de hambre. Desde el main,
    //   simula el paso del tiempo y la alimentación de la mascota.

    private String nombre;
    private int hambre;


    public Mascota(int hambre, String nombre) {
        this.hambre = hambre;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public void reducirHambre(){
        hambre=hambre -25;

        if (hambre<=0){
        hambre=0;
        System.out.println("no tiene hambre");
        }
    }
    public void pasarTiempo(int horas) {
        hambre += horas * 5;

        if (hambre>=100){
            hambre=100;
        }
    }

    public void mostrarEstado(){
        if (hambre>=0){
            System.out.println(getNombre() + " tiene hambre " + getHambre());
        }else if (hambre==100){
            System.out.println(getNombre() + " no  tiene " + getHambre());
        }else{
            System.out.println("parametro nulo");
        }

    }

}
