public class Vehiculo extends Pro {
    public int velocidad;
    public int velocidad_max = 100;

    public void setVelocidad(int velocidad){
        if(velocidad < velocidad_max){
            this.velocidad = velocidad;
        }else{
            this.velocidad = velocidad_max;
        }
    }

    public int velocidad(){
        return this.velocidad;
    }
}
