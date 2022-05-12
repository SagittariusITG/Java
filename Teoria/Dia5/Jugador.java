abstract class Jugador {
    public abstract String nombre();
    public abstract int vidas();
}

/*
public class Jugador {
    protected String nombre;
    protected int vidas;
    protected int[] coordenadas;

    private final static int VIDAS = 3;
    private final int[] COOR = {0, 0};

    public Jugador(String nombre){
        this.nombre = nombre;
        this.vidas = VIDAS;
        this.coordenadas = COOR;
    }

    private String imprCoor(){
        return ("(" + coordenadas[0] + ", " + coordenadas[1] + ")");
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nVidas: " + this.vidas + "\nCoordenadas: " + this.imprCoor();
    }

}