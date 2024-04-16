package Herencia;

public class herenciaApp {
    public static void main(String[] args) {
        herenciaClass a = new herenciaClass("elias", 'A',17,"frambuesos 1212");
        a.setNombre("Marias");
        hija1 belen = new hija1("soy belen");
        System.out.println(a.getNombre());
        System.out.println(belen);
    }
    
}
