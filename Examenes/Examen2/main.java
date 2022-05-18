// import java.util.Scanner;

// public class main {
//     public static void main(String[] args){
//         // Albergue aSimple = Albergue.SIMPLE;
//         // Albergue aDoble = Albergue.DOBLE;
//         // Albergue aTriple = Albergue.TRIPLE;
//         // Albergue aMulti = Albergue.MULTIPLE;

//         // String tipohabitacion;
//         // int personas;
//         // int noches = 1;
//         // Scanner sc = new Scanner(System.in);

//         // System.out.println("¿Que habitacion quieres?");
//         // tipohabitacion = sc.nextLine();

//         // // System.out.println("¿Cuantas personas sois?");
//         // // personas = sc.nextLine();

//         // System.out.println("¿Cuantas noches?");
//         // noches = sc.nextInt();

//         // if(habitacion.equals("simple")){
//         //     System.out.println("\n" + aSimple.toString());
//         //     System.out.println("Precio persona " + noches + " noches: " + aSimple.precio_noche_persona(noches) + "$.");
//         // } else if (habitacion.equals("doble")){
//         //     System.out.println("\n" + aDoble.toString());
//         //     System.out.println("Precio persona " + noches + " noches: " + aDoble.precio_noche_persona(noches) + "$.");
//         // } else if (habitacion.equals("triple")){
//         //     System.out.println("\n" + aTriple.toString());
//         //     System.out.println("Precio persona " + noches + " noches: " + aTriple.precio_noche_persona(noches) + "$.");
//         // } else if (habitacion.equals("multiple")){
//         //     System.out.println("\n" + aMulti.toString());
//         //     System.out.println("Precio persona " + noches + " noches: " + aMulti.precio_noche_persona(noches) + "$.");
//         // }
//         Scanner sc = new Scanner(System.in);

//         String tipohabitacion;
//         Albergue habitacion;
//         int personas;
//         bool validarPersonas = false;
//         int noches = 1;

//         while(!validarPersonas){
//             System.out.println("¿Que habitacion quieres? ");
//             tipohabitacion = sc.nextLine();
//             habitacion = Albergue.valueOf(tipohabitacion);
    
//             sc.nextLine();
    
//             System.out.println("¿Cuantas personas? ");
//             personas = sc.nextInt();
    
//             validarPersonas = habitacion.validarPersonas(personas);
//         }
//         System.out.println("¿Cuantas noches?");
//         noches = sc.nextInt();
//     }
// }


import java.util.Scanner;

public class main {
  public static void solucionAlternativa(int numPersonas){
    Albergue arrAlbergue[] = Albergue.values();
    double precio, habNecesarias;
    double descuento = 0.85; // 15% descuento == multiplicar * 0.85

    for ( Albergue h : arrAlbergue){
      habNecesarias = Math.ceil((double)numPersonas/(double)h.getPersonas());
      h.setDisponibles(-1);
      if (h.getDisponibles() > habNecesarias){
        precio = h.getPrecio()*descuento*habNecesarias;
        System.out.println("Con habitaciones de tipo " + h + " vas a necesitar " +
        habNecesarias + " habitaciones y el precio por dia con descuento es: " +
        precio + " euros.");
      }
    }

  }

  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);

    String tipoHabitacion;
    Albergue habitacion = Albergue.SIMPLE;
    int numPersonas = 0, numNoches;
    double precioTotal, precioPorPersona;
    double recaudacionTotal = 0;
    boolean numPersonasValido = false;
    while(habitacion.getDisponibles() != 0){
        System.out.println("\n\nPara finalizar escriba 'SALIR'.\n\n");
        while(!numPersonasValido){
            System.out.print("Indica el tipo de habitacion que desea: ");
            tipoHabitacion = sc.nextLine();
            // sc.nextLine();
            if(tipoHabitacion.equals("SALIR"));
            habitacion = Albergue.valueOf(tipoHabitacion);
            System.out.print("Indica el numero de personas: ");
            numPersonas = sc.nextInt();
            // sc.nextInt();
            sc.nextLine(); // Limpiamos el buffer.
            //System.out.println(" -- Comprobar que el numero de personas es valido -- ");
            numPersonasValido = habitacion.numPersonasValido(numPersonas);
          }
          System.out.print("Indica el numero de noches: ");
          numNoches = sc.nextInt();
          //System.out.println(" -- Cuanto vale la habitacion en total -- ");
          precioTotal = habitacion.precioTotal(numNoches);
          System.out.println("El precio total es de " + precioTotal + " euros.");
          //System.out.println(" -- Cuanto vale la habitacion en total por persona -- ");
          precioPorPersona = habitacion.precioPorPersona(numPersonas,precioTotal);
          System.out.println("El precio por persona es de " + precioPorPersona + " euros.");
          recaudacionTotal += precioTotal;
      
          if (habitacion.getDisponibles() == 0){
            System.out.println("Hemos cometido un error, toma descuento (estas son las opciones): ");
            solucionAlternativa(numPersonas);
          }
    }
    System.out.println("La recaudación total es de: " + recaudacionTotal + " euros.");
    }
}