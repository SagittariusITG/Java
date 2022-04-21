import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Titular de la cuenta: ");
        String tit = sc.nextLine();

        Cuenta c1 = new Cuenta(tit);

        System.out.println("Cantidad de dinero de la que dispone: ");
        double din = sc.nextDouble();

        c1.setCantidad(din);
        System.out.println(c1);
        
        c1.ingresar(12);
        System.out.println(c1);
        c1.retirar(14000);
        System.out.println(c1);
    }
}