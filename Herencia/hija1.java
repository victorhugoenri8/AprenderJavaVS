package Herencia;

public class hija1 extends herenciaClass{
    public hija1(){

    }
    //constructor
    public hija1(String nombre){
        this();
        this.nombre = nombre;
        System.out.println("se ha instanciado una hija ");
    }
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
}
