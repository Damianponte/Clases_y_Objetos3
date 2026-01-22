public class TarjetaTransporte {
    //Crea una clase TarjetaTransporte con un atributo saldo.
    // Implementa un constructor que reciba el saldo inicial.
    // Añade un método recargar que aumente el saldo y otro método pagarViaje que reste el coste del viaje solo si hay saldo suficiente.
    //  Añade un método mostrarSaldo. Desde el main, prueba distintos pagos y recargas.

    private double saldo;

    public TarjetaTransporte(double saldo) {
        this.saldo= saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void recarga(int aumento){
        saldo=saldo + aumento;
    }

    public void pagarViaje(int coste){
      if (saldo>coste){
          saldo=saldo-coste;
      }else{
          System.out.println("no tienes suficiente dinero");
      }
    }

    public void mostarSaldo(){
            System.out.println("el saldo actual es : " + getSaldo() + " euros");
    }
}
