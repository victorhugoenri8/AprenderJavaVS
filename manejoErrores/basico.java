package manejoErrores;
public class basico {
    public static void main(String[] args) {
       int div; 
        div=10;
        System.out.println(" ");
        System.out.println(div);
        try {
            div= 10/0;
            System.out.println(" ");
            System.out.println(div);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("lana el errore..." );
        }
        System.out.println("final");
    }
}
