// public enum Albergue{
//     SIMPLE (1, 50, 4),
//     DOBLE (2, 80, 4),
//     TRIPLE (3, 100, 4),
//     MULTIPLE (6, 150, 4);

//     private int personas;
//     private double precio;
//     private int disponible;

//     Albergue(int personas, double precio, int disponible){
//         this.personas = personas;
//         this.precio = precio;
//         this.disponible = disponible;
//     }

//     public String toString(){
//         return "La habitación es para " + this.personas + " personas y vale " + this.precio + "$.";
//     }

//     public String getPrecio(){
//         return this.precio;
//     }

//     public int getPersonas(){
//         return this.personas;
//     }

//     public int getDisponible(){
//         return this.disponible;
//     }

//     public void setPrecio(String precio) {
//         this.precio = precio;
//     }

//     public void setPersonas(int personas){
//         this.personas = personas;
//     }

//     public void setDisponible(int disponible){
//         this.disponible = disponible;
//     }

//     public double precio_noche_persona(double dias){
//         return (dias*this.precio);
//     }

//     public bool validarPersonas(int personas){
//         return personas <= this.personas;
//     }
// }

public enum Albergue{
    SIMPLE(1,50,2),
    DOBLE(2,80,4),
    TRIPLE(3,100,0),
    MULTIPLE(6,150,4);
  
    private int personas;
    private double precio;
    private int disponibles;
  
    Albergue(int personas, double precio, int disponibles){
      this.personas = personas;
      this.precio = precio;
      this.disponibles = disponibles;
    }
  
    public int getPersonas(){
      return this.personas;
    }
    public double getPrecio(){
      return this.precio;
    }
    public int getDisponibles(){
      return this.disponibles;
    }
  
    // setPersona y setPrecio no son necesarios para nuestro código.
    /*public void setPersonas(int personas){
      this.personas = personas;
    }
    public void setPrecio(double precio){
      this.precio = precio;
    }*/
    public void setDisponibles(int disponibles){
      this.disponibles = disponibles;
    }
  
    public boolean numPersonasValido(int numPersonas){
      return numPersonas <= this.personas;
    }
    public double precioTotal(int numNoches){
      return numNoches*this.precio;
    }
    public double precioPorPersona(int numPersonas, double precioTotal){
      return precioTotal/numPersonas;
    }
    public double precioPorPersona(int numPersonas, int numNoches){
      double precioTotal = this.precioTotal(numNoches);
      return precioTotal/numPersonas;
    }
  }