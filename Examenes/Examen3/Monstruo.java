public enum Monstruo{
    PICHU(0,0,0);

    private int vida_result;
    private int danio_result;
    private int agilidad_result;

    Random r = new Random();
    private int vida_low = 5;
    private int vida_high = 7;
    private int danio_low = 2;
    private int danio_high = 4;
    private int agilidad_low = 5;
    private int agilidad_high = 7;

    Monstruo(int vida, int danio, int agili){
        this.vida_result = vida;
        this.danio_result = danio;
        this.agilidad_result = agili;
    }

    private void setVida(){
        this.vida_result = r.nextInt(vida_low, vida_high + 1);
    }

    private void setDanio(){
        this.danio_result = r.nextInt(danio_low, danio_high + 1);
    }

    private void setAgilidad(){
        this.agilidad_result = r.nextInt(agilidad_low, agilidad_high + 1);
    }

    public int getVida(){
        return vida_result;
    }

    public int getDanio(){
        return danio_result;
    }

    public int getAgilidad() {
        return agilidad_result;
    }

}