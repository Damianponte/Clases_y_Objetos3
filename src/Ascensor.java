public class Ascensor {
    // Crea una clase Ascensor con un atributo plantaActual.
    //  Implementa un constructor que indique la planta inicial.
    //  Añade un método subir que aumente la planta en una unidad y otro método bajar que la reduzca.
    //   El ascensor solo puede moverse entre las plantas 0 y 10.
    //   Añade un método mostrarPlanta.
    //    Desde el main, simula varios movimientos del ascensor



    private int plantaActual;


    public Ascensor(int plantainicial) {
        if(plantainicial<0){
            this.plantaActual=0;
        }else if (plantainicial>10){
            this.plantaActual=10;
        }else{
            this.plantaActual=plantainicial;
        }

    }
    public int getPlantaActual() {
        return plantaActual;
    }

    public void aumentarPlanta(){

        plantaActual++;
        if (getPlantaActual()>10){
            plantaActual=10;
            System.out.println("no puedes subir mas de diez plantas");
        }
    }

    public void decrementarPlanta(){
        plantaActual--;
        if (getPlantaActual()<0){
            plantaActual=0;
            System.out.println("no puedes bajar mas de de la  planta 0");
        }
    }

    public void mostrarPlanta(){
        System.out.println("el ascensor esta en la planta :" + getPlantaActual());
    }
}
