public class Ascensor {
    // Crea una clase Ascensor con un atributo plantaActual.
    //  Implementa un constructor que indique la planta inicial.
    //  Añade un método subir que aumente la planta en una unidad y otro método bajar que la reduzca.
    //   El ascensor solo puede moverse entre las plantas 0 y 10.
    //   Añade un método mostrarPlanta.
    //    Desde el main, simula varios movimientos del ascensor

    private int plantaActual;


    public Ascensor(int plantaInicial) {
        this.plantaActual=0;

    }

    public void aumentarPlanta(int aumentar){

        plantaActual=plantaActual + aumentar;
        if (plantaActual>=10){
            plantaActual=10;
        }
    }

    public void decrementarPlanta(int decrementar){

        plantaActual=plantaActual + decrementar;
        if (plantaActual<=0){
            plantaActual=0;
        }
    }

    public int getPlantaActual() {
        return plantaActual;
    }

    public void mostrarPlanta(){
        System.out.println("el ascensor esta en la planta " + getPlantaActual());
    }

}
