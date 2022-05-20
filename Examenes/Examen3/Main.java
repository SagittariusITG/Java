import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Monstruo m1 = Monstruo.PICHU;
        YoMonstruo ym1 = YoMonstruo.SAGI;
        Scanner sc = new Scanner (System.in);
        int opcion;

        while(true){
            System.out.println("1. Pelear\n2. Huir\n3. Ver mis estadisticas\n4. Ver estadisticas enemigo.\n");
            opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("\nAtacar\n");
            } else if(opcion == 2){
                System.out.println("\nHuir\n");
                if(ym1.getAgilidad() > m1.getAgilidad()){
                    System.out.println("Eres mas agil");
                    break;
                } else {
                    System.out.println("Has perdido una vida.");
                    ym1.perderVida();
                }
            } else if(opcion == 3){
                System.out.println("\nMis estadisticas\n" + "Vida: " + ym1.getVida() + "\nDaño: " + ym1.getDanio() + "\nAgilidad: " + ym1.getAgilidad());
                System.out.println("\n\n");
            } else if(opcion == 4){
                System.out.println("\nVer estadisticas Monstruo\n" + "Vida: " + m1.getVida() + "\nDaño: " + m1.getDanio() + "\nAgilidad: " + m1.getAgilidad());
                System.out.println("\n\n");
            }
        }
    }
}
