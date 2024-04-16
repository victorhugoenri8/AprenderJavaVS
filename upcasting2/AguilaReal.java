package upcasting2;

public class AguilaReal  extends Aguila{

    String nombreReal="soy un aguila Real";
    int pies;

    public AguilaReal(String nombre, int edad, int pies) {
        super(nombre, edad);
        this.pies=pies;
        
    
    }


    public void volar() {
        System.out.println("si puedo volar....");
    }
    
    
   
    public void pico() {
       System.out.println("pero del ave Real");
    }
}
