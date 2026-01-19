public class CuentaBancaria {
    //Crea una clase llamada CuentaBancaria. La clase debe tener como atributos el nombre del titular y el saldo.
    // Implementa un constructor que inicialice ambos valores.
    // Añade un método ingresar que sume una cantidad al saldo y otro método retirar que reste una cantidad solo si hay saldo suficiente.
    //  Añade también un método que muestre por pantalla el estado actual de la cuenta.
    //   Desde el main, crea una cuenta y prueba todos los métodos.

    private String nombre;
    private double saldo;

    public CuentaBancaria(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = 1000;
    }
    public double ingresar(double saldoNuevo){
        saldo= saldo + saldoNuevo;
        return saldoNuevo;
    }

    public double retirarSaldo(double saldoHaRetirar){
        if(saldo>=saldoHaRetirar){
            saldo=saldo - saldoHaRetirar;
            return saldoHaRetirar;
        }else{
             System.out.println(" no tienes suficiente saldo");
                return 0;
        }

    }
    public void estadoCuenta(){
        System.out.println("Titular: " + nombre);
        System.out.println("Saldo: " + saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
}
