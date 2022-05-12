public class main {
    public static void main(String[] args){
        String password = "098";
        for (int i = 0; i < password.length(); i++){
            if(password.charAt(i) == password.charAt(i++)){
                System.out.println(password.charAt(i));
            }
        }
    }
}
