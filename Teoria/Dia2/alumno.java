public class alumno extends persona {
    private String grado;           // Solo desde la clase
            String gradoSinMod;     // Acceso desde el paquete
    protected String gradoProt;     // Acceso desde los hijos y el paquete (carpeta)
    public String gradoPubl;        // Acceso global

    enum Nota{
        SOBRESALIENTE,
        NOTABLE,
        BIEN,
        SUFICIENTE,
        INSUFICIENTE
    }

    Nota nota;
    private String resultadoNotas;

    public alumno(){
        super();
        this.grado = "DAW";
        this.nota = Nota.SUFICIENTE;
    }
    public alumno(String name, String dni, String grado) {
        super(name, dni);
        this.grado = grado;
        this.nota = Nota.SUFICIENTE;
    }

    public alumno(alumno Alumno){
        super(Alumno.name, Alumno.dni);
        this.grado = Alumno.grado;
        this.nota = Nota.SUFICIENTE;
    }

    private String stringNotas(){
        switch(this.nota){
            case SOBRESALIENTE:
                resultadoNotas = "Makina.";
                break;
            case NOTABLE:
                resultadoNotas = "Grande";
                break;
            case BIEN:
                resultadoNotas = "Bien.";
                break;
            case SUFICIENTE:
                resultadoNotas = "Let's go.";
                break;
            case INSUFICIENTE:
                resultadoNotas = "Come polla";
                break;
        }
        return resultadoNotas;
    }

    public String toString(){
        return "Nombre: " + this.name + "." + "\nDNI: " + this.dni + "." + "\nGrado: " + this.grado + "." + "\nNota: " + this.nota + ".";
    }

    public String getGrado(){
        return this.grado;
    }

    public Nota getNota(){
        return this.nota;
    }

    public void setGrado(String grado){
        this.grado = grado;
    }

    public void setNota(Nota nota){
        this.nota = nota;
    }
}