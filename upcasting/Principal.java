package upcasting;

public class Principal {
   public Principal() {
   }

   public static void main(String[] args) {
      Concesionaria c = new Concesionaria();
      Auto a = new Auto(true, "MarcaFalsa", "XYZ", "ABC123");
      a.acelerar();
      c.agregarVehiculo(a);
      c.agregarVehiculo(new Moto(20, "OtraMarca", "XHT", "BCD234"));
      
      System.out.println(c.getobjetoVehiculo(0));
   
   }
}
