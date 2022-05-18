enum Transporte{
    AVION (900, 10),
    TREN (200, 14),
    COCHE (120, 12),
    BICICLETA (20, 0);

    private double velocidad;
    private double precio100km;

    MediosTransporte(double velocidad, double precio100km){
        this.velocidad = velocidad;
        this.precio100km = precio100km;
    }

    public double getVelocidad(){
        return this.velocidad;
    }

    public double getPrecio100km(){
        return this.precio100km;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public void setPrecio100km(double precio100km){
        this.precio100km = precio100km;
    }

    public double tiempo(double km){
        double espera = 1;
        double tiempoTotal = km/this.velocidad;
        if(this == AVION) tiempoTotal += espera;
        return tiempoTotal;
    }

    public double precio(double km){
        return (km/100)*this.precio100km;
    }
}