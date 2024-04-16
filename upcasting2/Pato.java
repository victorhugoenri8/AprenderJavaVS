package upcasting2;

public class Pato extends Ave{

    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void sonido(){

        System.out.println("hago el sonido de pato");
    }
    
}
