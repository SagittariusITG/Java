import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int opcion = 0;
        double kilometros;

        MediosTransporte mtAvion = MediosTransporte.AVION;
        MediosTransporte mtTren = MediosTransporte.TREN;
        MediosTransporte mtCoche = MediosTransporte.COCHE;
        MediosTransporte mtBici = MediosTransporte.BICI;

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
                System.out.println("Si quiero recorrer 200km, tardo " + mtAvion.tiempo(200));
            } elif(opcion == 3){
                System.out.println("Por hacer.");
            }
        }
    }
}
