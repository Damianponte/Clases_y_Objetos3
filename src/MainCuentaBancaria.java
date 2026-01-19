import java.util.Scanner;

public class MainCuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta=new CuentaBancaria("Pepe",1000) ;

        Scanner lector=new Scanner(System.in);
        int opcion=-1;

        while(opcion!=0){
            System.out.println("ha entrado en abanca,que desea hacer");
            System.out.println("opcion: 1. Comprobar saldo");
            System.out.println("opcion: 2. Ingresar dinero");
            System.out.println("opcion: 3. Retirar dinero");
            System.out.println("opcion: 0. Salir");
             opcion=lector.nextInt();

            if(opcion==1){
                cuenta.estadoCuenta();
            }else if (opcion==2){
                System.out.println("cuanto quieres ingresar?");
                cuenta.ingresar(lector.nextDouble());

                System.out.println("tu saldo ahora es de : " +  cuenta.getSaldo());
            }else if (opcion==3){
                System.out.println("cuanto quieres retirar?");
                cuenta.retirarSaldo(lector.nextDouble());
                System.out.println("tu saldo ahora es de : " +  cuenta.getSaldo());
            }else if (opcion==0){

                System.out.println("hasta la proxima");
            }else{
                System.out.println("numero no valido, intentelo de nuevo");
            }


        }

    }
}
