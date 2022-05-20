import java.util.Random;

public enum Monstruo{
    PICHU;

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

    Monstruo(){
        this.vida_result = r.nextInt(vida_high - vida_low) + vida_low;
        this.danio_result = r.nextInt(danio_high - danio_low) + danio_low;
        this.agilidad_result = r.nextInt(agilidad_high - agilidad_low) + agilidad_low;

        // setVida();
        // setDanio();
        // setAgilidad();
    }

    // private void setVida(){
    //     this.vida_result = r.nextInt(vida_low - vida_high) + vida_low;
    // }

    // private void setDanio(){
    //     this.danio_result = r.nextInt(danio_low - danio_high) + danio_low;
    // }

    // private void setAgilidad(){
    //     this.agilidad_result = r.nextInt(agilidad_low - agilidad_high) + agilidad_low;
    // }

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