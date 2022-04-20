public class persona {
    protected String name;
    protected String dni;

    // Constructor
    public persona(){
        this.name = "John Cena";
        this.dni = "12345678D";
    }

    public persona(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    public persona(persona p){
        this.name = p.name;
        this.dni = p.dni;
    }

    //Tostring
    public String toString(){
        return "Me llamo " + this.name + " y mi dni es " + this.dni + ".";
    }

    public String getName(){
        return this.name;
    }

    public String getDni(){
        return this.dni;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
}
