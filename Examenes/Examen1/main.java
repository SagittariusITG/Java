import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        Electrodomestico e1 = new Electrodomestico();

        System.out.println("Precio: ");
        String pre = sc.nextLine();

        double pree = Double.parseDouble(pre);
        e1.setPrecio(pree);


        System.out.println("Color del electrodomestico: ");
        String col = sc.nextLine();

        e1.setColor(col);

        System.out.println("Consumo del electrodomestico: ");
        String cons = sc.nextLine();

        e1.setConsumo(cons);

        System.out.println("Peso del electrodomestico: ");
        String pes = sc.nextLine();

        double pess = Double.parseDouble(pes);
        e1.setPeso(pess);

        // System.out.println("\n");
        System.out.println("\nElectrodomestico\n\n" + e1);
    }
}