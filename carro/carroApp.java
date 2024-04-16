package carro;

public class carroApp {
    public static void main(String[] args) {
        carroClass elias = new carroClass();
        elias.marca = "toyota";
        elias.arrancar();
        elias.encender();
        elias.apagar();
    System.out.println(elias.marca);
    }
}
