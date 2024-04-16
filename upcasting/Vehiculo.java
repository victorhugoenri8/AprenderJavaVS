package upcasting;


public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
 
    public Vehiculo(String marca, String modelo, String patente) {
       this.marca = marca;
       this.modelo = modelo;
       this.patente = patente;
    }
 
    public void acelerar() {
       System.out.println("Acelerando...");
    }
 
    public void frenar() {
       System.out.println("Frenando...");
    }
 
    private void chequearMotor() {
       System.out.println("Chequeando motor...");
    }
 
    public String getMarca() {
       return this.marca;
    }
 
    public void setMarca(String nuevaMarca) {
       if (nuevaMarca != null) {
          this.marca = nuevaMarca;
       }
 
    }
 
    public void encender() {
       this.chequearMotor();
       System.out.println("Encendiendo...");
    }
 
    public String toString() {
       return "Vehiculo{marca=" + this.marca + ", modelo=" + this.modelo + ", patente=" + this.patente + "}";
    }
 }
