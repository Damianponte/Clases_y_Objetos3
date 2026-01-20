public class MainAscensor {
    public static void main(String[] args) {
        Ascensor planta=new Ascensor(4);

        System.out.println("el ascensor esta en la planta " + planta.getPlantaActual() );

        System.out.println(" el ascensor ha subido una planta");
               planta.aumentarPlanta();
                planta.mostrarPlanta();
        System.out.println(" el ascensor ha subido una planta");
        planta.aumentarPlanta();
        planta.mostrarPlanta();
        System.out.println(" ");
        System.out.println(" el ascensor esta bajando;");
        planta.decrementarPlanta();
        planta.mostrarPlanta();
        System.out.println(" ");
        System.out.println(" el ascensor esta bajando;");
        planta.decrementarPlanta();
        planta.mostrarPlanta();
        System.out.println(" ");
        System.out.println(" el ascensor esta bajando;");
        planta.decrementarPlanta();
        planta.mostrarPlanta();







    }
}
