package upcasting;

import java.util.ArrayList;

public class Concesionaria {
   private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

   public Concesionaria() {
   }

   public void agregarVehiculo(Vehiculo a) {
      this.vehiculos.add(a);
   }
   public Vehiculo getobjetoVehiculo(int a){
      return vehiculos.get(a);
   }
}