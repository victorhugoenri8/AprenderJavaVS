package boletos;

import java.util.Scanner;

public class boletos {
    public static void main(String[] args) {
        menu menu = new menu(); // intanciamos objeto menu
        filas filas = new filas();// instanciamos objeto filas
        @SuppressWarnings("resource") // excluye alerta de error en Scanner
        Scanner imput = new Scanner(System.in);
        int acum = 0;// acumulador de boletos vendidos no mas de 5

        int seleccion = 0;

        menu.mostrar();

        do {
            // dependiendo de el numero seleccionado muestra algo
            seleccion = imput.nextInt();
            if (seleccion == 1) {

                menu.mostrar();
            } else if (seleccion == 2) {
                System.out.println("L = asientos lobres... X = asientos vendidos...");
                filas.mostrar();

            } else if (seleccion == 3) {

                // seleccionar fila y columna
                int fila;
                int columna;
                System.out.println("selecciona una fila");
                fila = imput.nextInt();
                System.out.println("selecciona una columna");
                columna = imput.nextInt();

                if (filas.validar(fila, columna)) {// validar si el asiento esta vendido

                    filas.registrar(fila, columna);
                    acum = acum + 1;
                } else {
                    do {
                        // mientras continua seleccionando asientos ocupados
                        System.out.println("el boleto ya esta vendido...selecciona otro...");
                        System.out.println("selecciona una fila");
                        fila = imput.nextInt();
                        System.out.println("selecciona una columna");
                        columna = imput.nextInt();

                        filas.registrar(fila, columna);
                    } while (filas.validar(fila, columna));

                }
                // menu.mostrar();
            }

            menu.mostrar();

        } while ((seleccion != 4) && (acum < 5));
        // para el final del programa al llegar a 5 boletos vendidos o presionar 4
        System.out.println("haz comprado 5 boletos, el maximo permitido por persona.... gracias.");
        filas.mostrar();

        System.out.println("adios");

    }

}
