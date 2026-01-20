public class MainReproducirMusica {
    public static void main(String[] args) {
        ReproducirMusica cancion =new ReproducirMusica(5);

        cancion.MostrarEstado();
        System.out.println("ha subido el volumen al maximo");
        cancion.AumentarVolumen(100);
        cancion.MostrarEstado();
        System.out.println("como hacia tanto ruido vinieron y lo bajaron a 30");
        cancion.descenderVolumen(70);
        cancion.MostrarEstado();

        


    }
}
