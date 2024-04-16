package Cuenta;

public class cuentaApp {

    public static void main(String[] args) {

    cuentaClass cuenta1 = new cuentaClass("Lana");

    cuentaClass cuenta2 = new cuentaClass("Victor", 50);

    cuenta1.Ingresar(60);

    cuenta1.Retirar(40);
    double totalCuenta1=cuenta1.getCuenta();
    System.out.println(totalCuenta1);

    cuenta2.Ingresar(10);

    cuenta2.Retirar(50);
     double totalCuenta2=cuenta2.getCuenta();
    System.out.println(totalCuenta2);

    }
    
}
