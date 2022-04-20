public class alumno extends persona {
    private String grado;           // Solo desde la clase
            String gradoSinMod;     // Acceso desde el paquete
    protected String gradoProt;     // Acceso desde los hijos y el paquete (carpeta)
    public String gradoPubl;        // Acceso global

    public alumno(){
        super();
        this.grado = "DAW";
    }
    public alumno(String name, String dni, String grado) {
        super(name, dni);
        this.grado = grado;
    }

    public alumno(alumno Alumno){
        super(Alumno.name, Alumno.dni);
        this.grado = Alumno.grado;
    }

    public String toString(){
        return "Nombre: " + this.name + "." + "\nDNI: " + this.dni + "." + "\nGrado: " + this.grado + ".";
    }

    public String getGrado(){
        return this.grado;
    }

    public void setGrado(String grado){
        this.grado = grado;
    }
}