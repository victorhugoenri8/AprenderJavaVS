
public class diarioClass {

      private String nombre;
      private int sueldo;
      private static int bono;

      public diarioClass(){

      }

      public diarioClass(String nombre, int sueldo){
         this.nombre = nombre;
         this.sueldo = sueldo;
      }

      public String getNombre(){
         return this.nombre;
      }
      public void setNombre(String nombre){
         this.nombre = nombre;
      }
      public int getSueldo(){
         return this.sueldo;
      }
      public void setSueldo(int sueldo){
         this.sueldo = sueldo;
      }

      public void bono(int bono){
         diarioClass.bono = bono;
      }

      public void recompensa(){
         System.out.println("el sueldo de " + this.nombre + " es de " + 
                              this.sueldo + " y con su bono el total es de " +
                              (this.sueldo + diarioClass.bono));
      }

}