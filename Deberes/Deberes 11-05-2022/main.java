import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int opcion = 0;
        int v_avion = 900;
        int v_tren = 200;
        int v_coche = 120;
        int v_bicicleta = 20;

        enum Transporte{
            AVION,
            TREN,
            COCHE,
            BICICLETA;
        }

        Scanner sc = new Scanner(System.in);

        while(opcion != 4){
            System.out.println("\n\t\tMenú\n*-------------------------------*\n1. Consultar transportes públicos.\n2. Caluclar tiempo.\n3. Calcular dinero.\n 4. Salir");
            opcion = sc.nextInt();
            System.out.println("\n");
            if(opcion == 1){
                for (Transporte t : Transporte.values()){
                    System.out.println(t);
                }
            } elif(opcion == 2){
                //2500km
                //125km
                System.out.println("Por hacer");
            } elif(opcion == 3){
                System.out.println("Por hacer.");
            }
        }
    }
}
