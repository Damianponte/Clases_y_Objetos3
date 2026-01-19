public class MainContador {
    public static void main(String[] args) {
        //Crea una clase Contador que tenga un atributo valor.
        // Implementa un constructor que permita indicar el valor inicial.
        // Añade métodos para incrementar el contador, decrementarlo y reiniciarlo a cero.
        // El contador nunca puede tener valores negativos.
        // Añade un método que muestre el valor actual.
        //  Desde el main, prueba todas las operaciones.

        Contador contador1=new Contador(30);

        contador1.valorActual();

        contador1.incrementar();

        contador1.valorActual();

        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();
        contador1.incrementar();

        contador1.valorActual();

        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();

        contador1.valorActual();

        contador1.reiniciar();
        contador1.valorActual();

        contador1.incrementar();
        contador1.valorActual();

    }
}
