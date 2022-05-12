public class main {
    public static void main(String[] args){
        Noob jugador = new Noob();
        jugador.setName("Juanmi");
        jugador.setVidas(3);
        System.out.println("Holi " + jugador.nombre() + " tienes " + jugador.vidas() + " vidas.");

        Pro jugador1 = new Pro();
        jugador1.setName("Emilio");
        jugador1.setVidas(5);
        Vehiculo.setVelocidad(50);
        System.out.println("Holi " + jugador1.nombre() + " tienes " + jugador1.vidas() + " vidas y mi jeepeta va a " + jugador1.velocidad() + "km/h.");

        /*
        Jugador j1 = new Jugador("Pedro");
        System.out.println(j1);
        */
    }
}