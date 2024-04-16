package upcasting;

public class Auto extends Vehiculo {
    private boolean tieneAire;
 
    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
       super(marca, modelo, patente);
       this.tieneAire = tieneAire;
    }
 
    public void prenderAire() {
       if (this.tieneAire) {
          System.out.println("Encendiendo aire...");
       }
 
    }
 }