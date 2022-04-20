import java.util.ArrayList;

public class Profesor extends persona {
    private double sueldo;
    private ArrayList<String> asignaturas = new ArrayList<String>();

    public Profesor(){
        super();
        this.sueldo = 900.00;
        // this.asignaturas.add("");
    }
    public Profesor(String name, String dni, double sueldo, String asignatura) {
        super(name, dni);
        this.sueldo = sueldo;
        this.asignaturas.add(asignatura);
    }

    public Profesor(Profesor profesor){
        super(profesor.name, profesor.dni);
        this.sueldo = profesor.sueldo;
        this.asignaturas = profesor.asignaturas;
    }

    public String toString(){
        return "Nombre: " + this.name + "." + "\nDNI: " + this.dni + "." + "\nSueldo: " + this.sueldo + "$." + "\nAsignaturas: " + this.asignaturas;
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public ArrayList<String> getAsignaturas(){
        return this.asignaturas;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    public void setAsignatura(String asignatura){
        this.asignaturas.add(asignatura);
    }
}
