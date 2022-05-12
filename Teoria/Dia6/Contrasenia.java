abstract class Contrasenia {
    protected String password;

    public abstract String diff();
    public abstract char car_valido();
    public abstract int long_valido();

    public String toString(){
        return password;
    }

    public void setPassword(String password){
        int cont = 0;
        for(int i=0; i<password.length(); i++){
            cont++;
            if(password.charAt(i) == password.charAt(cont - 1)){
                System.out.println("Semen");
            }
        }
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
}
