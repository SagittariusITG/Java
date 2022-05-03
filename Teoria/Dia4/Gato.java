public class Gato implements Animal_innterfaz {
    protected String alimentacion;

    public String onomatopeya(){
        return "Miau";
    }
    public String durmiendo(){
        return "ZzZzZz... RRrrRRRrrr...";
    }

    public String comiendo(){
        alimentacion = "Peces";
        return "Yo como " + alimentacion + ".";
    }
}