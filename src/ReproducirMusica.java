public class ReproducirMusica {

    //Crea una clase ReproductorMusica con un atributo volumen.
    // Implementa un constructor que inicialice el volumen.
    // Añade métodos para subir y bajar el volumen.
    // El volumen debe mantenerse siempre entre 0 y 100.
    // Añade un método mostrarVolumen.
    //  Desde el main, prueba diferentes cambios de volumen.


        private int volumen;

    public ReproducirMusica(int volumen) {
        this.volumen = volumen;
    }

    public void AumentarVolumen(int aumento){
        volumen=volumen + aumento;
        if(volumen>=100){
            volumen=100;
        }


    }
    public void descenderVolumen(int descender) {
        volumen = volumen - descender;
        if (volumen <= 0) {
            volumen = 0;
        }

    }
    public void MostrarEstado() {
        System.out.println(" el volumen es: " + getVolumen());

    }

    public int getVolumen() {
        return volumen;
    }
}
