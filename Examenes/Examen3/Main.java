import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Monstruo m1 = Monstruo.PICHU;
        Scanner sc = new Scanner (System.in);
        int opcion;

        while(true){
            System.out.println("1. Pelear\n2. Huir\n3. Ver mis estadisticas\n4. Ver estadisticas enemigo.\n");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("\nAtacar\n");
            } else if(opcion == 2){
                System.out.println("\nAtacar\n");
            } else if(opcion == 3){
                System.out.println("\nVer mis estadisticas\n" + m1.getVida());
            } else if(opcion == 4){
                System.out.println("\nAtacar\n");
            }
        }
    }
}
