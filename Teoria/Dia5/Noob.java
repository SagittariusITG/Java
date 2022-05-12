public class Noob extends Jugador{
    private String nombre;
    private int vidas;

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
}
