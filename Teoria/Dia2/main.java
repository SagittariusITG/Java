import java.util.Scanner;

public class main {
    public static void main(String[] args){

        enum Color{
            AZUL(0),
            AMARILLO(0),
            VERDE(0),
            ROJO(0);

            private int numLapices;

            public Color(int num){
                this.numLapices = num;
            }

            public int getNumlapices(){
                return this.numLapices;
            }

            public void setNumlapices(int num){
                this.numLapices = num;
            }

        }

        // Persona
        persona miPersona = new persona();
        System.out.println(miPersona);
        miPersona.setName("Pepe");
        miPersona.setDni("87654321F");
        System.out.println(miPersona);

        // Alumno
        System.out.println("\n\nAlumno:\n");
        alumno al = new alumno();
        al.setName("Gerard");
        al.setDni("56382953K");
        al.setGrado("DAW");
        System.out.println(al);

        // Profesor
        System.out.println("\n\nProfesor:\n");
        Profesor prof = new Profesor();
        prof.setName("Celia");
        prof.setDni("90275648U");
        prof.setSueldo(1200.89);
        System.out.println("¿Cuantas asignaturas imparte el profesor? ");

        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();

        for(int i = 0; i < cantidad+1; i ++){
            System.out.println("\nAsignatura: ");
            String asign = sc.nextLine();
            prof.setAsignatura(asign);
        }

        System.out.println(prof);

        // Colores
        Color arrColor[] = Color.values();
        for (color c : arrColor) {
            System.out.println(c);
        }
        System.out.println("Ordinal de ROJO");
        Color miColor = Color.valueOf("ROJO");
        System.out.println(miColor.ordinal());

        System.out.println("Mostramos cuantos lapices tenemos de cada color");
        System.out.println(Color.AZUL.getNumlapices());
        System.out.println("Mostramos cuantos lapices tenemos de cada color");
        for (color c : Color.values()) {
            System.out.println(c + c.getNumlapices());
        }
    }
}
