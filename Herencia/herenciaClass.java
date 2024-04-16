package Herencia;

public class herenciaClass {

    //atributos
    protected String nombre;
    protected char id;
    protected int edad;
    protected String direccion;

    //constructor
    public herenciaClass(String nombre, char id, int edad, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.direccion = direccion;
    }

    public herenciaClass(String nombre2) {
        this.nombre=nombre2;
    }
    public herenciaClass(){
        
    }

    //get y set
    public String getDireccion() {
        return this.direccion;
    }
   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getId() {
        return this.id;
    }
    public void setId(char id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "el nombre es:" + this.nombre + "";
    }
    
}

