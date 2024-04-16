package estatico;

public class statico {
    public int id;
    static int contid = 1;
    String nombre;

    static{
        System.out.println("desde bloque statatico");
    }
    static{
        System.out.println("segundo estatico");
    }
    {
        System.out.println("desde bloque standar");
    }

    
    public statico(String nombre) {
        System.out.println("desdse constructor");
        this.nombre = nombre;
        this.id = contid;
        ++contid;
    }

    public void getatrib() {
        System.out.println(this.nombre + "  " + this.id);
    }
}
