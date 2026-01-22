public class MainTarjetaTransporte {
    public static void main(String[] args) {

        TarjetaTransporte visa=new TarjetaTransporte(150);

        visa.mostarSaldo();

        System.out.println("has ingresado 100");

        visa.recarga(100);
        visa.mostarSaldo();

        System.out.println("compramos un billete de avion para 200");
        visa.pagarViaje(250);

        visa.mostarSaldo();



    }
}
