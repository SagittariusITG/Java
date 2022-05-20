import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        
        Random r = new Random();
        int vida_low = 5;
        int vida_high = 7;
        int vida_result = r.nextInt(vida_low, vida_high + 1);
        int danio_low = 2;
        int danio_high = 4;
        int danio_result = r.nextInt(danio_low, danio_high + 1);
        int agilidad_low = 5;
        int agilidad_high = 7;
        int agilidad_result = r.nextInt(agilidad_low, agilidad_high + 1);

        Monstruo m1 = Monstruo.PICHU;
        Scanner sc = new Scanner (System.in);
        int opcion;

        while(true){
            System.out.println("1. Pelear\n2. Huir\n3. Ver mis estadisticas\n4. Ver estadisticas enemigo.\n");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("\nAtacar\n");
            } else if(opcion == 2){
                System.out.println("\nHuir\n");
            } else if(opcion == 3){
                System.out.println("\nMis estadisticas\n");
            } else if(opcion == 4){
                System.out.println("\nVer estadisticas Monstruo\n" + "Vida: " + m1.getVida() + "\nDaño: " + m1.getDanio() + "\nAgilidad: " + m1.getAgilidad());
            }
        }
    }
}
