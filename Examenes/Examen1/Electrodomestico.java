public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    private String [] consumos = {"AAA", "AA", "A", "B", "C", "D", "E", "F"};
    private String [] colores = {"BLANCO", "NEGRO", "ROJO", "AZUL", "METALIZADO"};

    public Electrodomestico(){
        this.precioBase = 100;
        this.color = "Blanco";
        this.consumoEnergetico = "F";
        this.peso = 20;
    }

    public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(Electrodomestico electrodomestico){
        this.precioBase = electrodomestico.precioBase;
        this.color = electrodomestico.color;
        this.consumoEnergetico = electrodomestico.consumoEnergetico;
        this.peso = electrodomestico.peso;
    }

    public String toString(){
        return "Precio base: " + this.precioBase + "$\nColor: " + this.color + "\nConsumo: " + this.consumoEnergetico + "\nPeso: " + this.peso + "kg";
    }

    public void setPrecio(double precio){
        if(precio > 0){
            this.precioBase = precio;
        }
    }

    public void setColor(String color){
        color.toUpperCase();
        for(int i = 0; i < 5; i++){
            if(color.toUpperCase() == colores[i]){
                this.color = color;
            }
        }
    }

    public void setConsumo(String consumo){
        consumo.toUpperCase();
        for(int i = 0; i < 8; i++){
            if(consumo.toUpperCase() == consumos[i]){
                this.consumoEnergetico = consumo;
            }
        }
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPrecio(){
        return this.precioBase;
    }

    public String getColor(){
        return this.color;
    }

    public String getConsumo(){
        return this.consumoEnergetico;
    }

    public double getPeso(){
        return this.peso;
    }
}