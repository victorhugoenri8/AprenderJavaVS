package Cuenta;

public class cuentaClass {
    private String titular;
    private double cuenta;

    public cuentaClass(String titular, double cuenta) {

        this.titular = titular;
        this.cuenta = cuenta;
        System.out.println("constructor doble");
    }

    public cuentaClass(String titular) {
        this.titular = titular;
        this.cuenta = 0;
        System.out.println("constructor simple");
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public String getTitular() {

        return titular;
    }

    public double getCuenta() {

        return cuenta;

    }

    public void Ingresar(double cantidad) {

        if (cantidad >= 1) {
            cuenta = this.cuenta + cantidad;
        }
    }

    public void Retirar(double Retirar) {

        this.cuenta = this.cuenta - Retirar;
        if (this.cuenta <= 0) {
            this.cuenta = 0;
        }
    }

}