public class elevar_potencia {
    public static void main(String[] args) {
        int acumulador = 0;
        int caja = 0;
        
        for (int i = 3; i <=30; i++) {
            caja= (int) Math.ceil(Math.pow(i,3));
            acumulador = acumulador + caja;
            
        }
        System.out.println("el cubo de " + "30" + " es " +caja);
        int suma = (int) acumulador;
        System.out.println("el suma total de todos los resultados es " + suma);
    }
}
