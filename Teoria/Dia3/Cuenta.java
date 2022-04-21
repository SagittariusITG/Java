public class Cuenta {
    protected String titular;
    protected double cantidad;

    // Constructor
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0.00;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(Cuenta cuenta){
        this.titular = cuenta.titular;
        this.cantidad = cuenta.cantidad;
    }

    public String toString(){
        return "El titular de la cuenta es: " + this.titular + "\nCantidad disponible: " + this.cantidad + "$.";
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double setCantidad(double cantidad){
        if(cantidad < 0){
            System.out.println("\nNo puedes establecer una cantidad negativa.\n");
            return -1;
        } else {
            System.out.println("\nCantidad introducida correcta.\n");
            return this.cantidad = cantidad;
        }
    }

    public String getTitular(){
        return this.titular;
    }

    public double getCantidad(){
        return this.cantidad;
    }

    public double ingresar(double cantidad) {
        if(cantidad < 0){
            System.out.println("\nNo puedes ingresar una cantidad negativa.\n");
            return -1;
        } else {
            System.out.println("\nCantidad ingresada correctamente.\n");
            return this.cantidad = this.cantidad + cantidad;
        }
    }

    public double retirar(double cantidad) {
        if(cantidad < 0){
            System.out.println("\nNo puedes ingresar una cantidad negativa.\n");
            return -1;
        } else if(cantidad > this.cantidad) {
            System.out.println("\nLa cuenta no tiene tanto dinero.\n");
            return -1;
        } else {
            System.out.println("\nCantidad ingresada correctamente.\n");
            return this.cantidad = this.cantidad - cantidad;
        }
    }
}