package calculadora;

public class calApp {

    public static void main(String[] args) {
        
        calClass operacion = new calClass();
        operacion.sumar(3,5);

        int lana = operacion.sumar(3,5);
        System.out.println(lana + 10);

    }

}
