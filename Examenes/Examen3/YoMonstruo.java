import java.util.Random;

public enum YoMonstruo{
    SAGI;

    private int vida_result;
    private int danio_result;
    private int agilidad_result;

    Random r = new Random();
    
    private int vida_low = 1;
    private int vida_high = 5;
    
    private int danio_low = 3;
    private int danio_high = 6;
    
    private int agilidad_low = 3;
    private int agilidad_high = 7;

    YoMonstruo(){
        setVida();
        setDanio();
        setAgilidad();
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
        return this.vida_result;
    }

    public int getDanio(){
        return this.danio_result;
    }

    public int getAgilidad(){
        return this.agilidad_result;
    }

    public int perderVida(){
        return (this.vida_result - 1);
    }
}