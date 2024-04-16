package upcasting2;


public class Ave {
    String nombre;
    int edad;
    int familia=100;
 
    public Ave(String nombre, int edad){
            super();
            this.nombre = nombre;
            this.edad = edad;
        }

    public void volar(){
        System.out.println("no puedo volar...");
    }

    public void pico(){
        System.out.println("Ave.pico()");
    }
    public void soloPadre(){
        System.out.println("Ave.soloPadre()");
    }

    public Pato pato1 (Pato unPato){
        unPato.sonido();
        return unPato;
    }
}
