public class Pro extends Jugador{
    private String nombre;
    private int vidas;
    private int velocidad;

    public void setName(String nombre){
        this.nombre = nombre;
    }

    public void setVidas(int vidas){
        this.vidas = vidas;
    }

    public String nombre(){
        return this.nombre;
    }

    public int vidas(){
        return this.vidas;
    }

    public int velocidad(){
        return this.velocidad;
    }
}

/*
public class Pro extends Jugador{
    protected Vehiculo coche;

    public Pro(String nombre){
        super(nombre);
        this.coche = new Vehiculo();
    }

    public String toString(){
        return super.toString() + " " + coche.toString();
    }
}
