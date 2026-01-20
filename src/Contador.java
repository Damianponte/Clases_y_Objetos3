public class Contador {
    //Crea una clase Contador que tenga un atributo valor.
    // Implementa un constructor que permita indicar el valor inicial.
    // Añade métodos para incrementar el contador, decrementarlo y reiniciarlo a cero.
    // El contador nunca puede tener valores negativos.
    // Añade un método que muestre el valor actual.
    //  Desde el main, prueba todas las operaciones.

    private int valor;


    public Contador(int valorInicial) {
        if(valorInicial<0){
            this.valor=0;
        }else{
            this.valor = valorInicial;
        }

    }

    public void incrementar(){
        valor=valor+1;
    }

    public void decrementar(){
        valor=valor-1;
    }

    public void reiniciar(){
        valor=0;

    }

    public int getValor() {
        return valor;
    }

    public void valorActual(){
        System.out.println("el valor actual del contador es: " + getValor());
    }
}
