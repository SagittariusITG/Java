public enum Monstruo{
    PICHU(0,0,0);

    private int vida_result;
    private int danio_result;
    private int agilidad_result;

    Monstruo(int vida, int danio, int agili){
        this.vida_result = vida;
        this.danio_result = danio;
        this.agilidad_result = agili;
    }

    public int getVida(){
        return this.vida_result;
    }

    public int getDanio(){
        return this.danio_result;
    }

    public int getAgilidad(){
        return this.agilidad_result;
    }

}