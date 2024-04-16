package boletos;

public class filas {

    String[][] Filas = new String[10][10]; //creacion del  array de 10 x 10

    public filas() {
            //iniciar en el constructor todas con L de asiento libre
        for (int i = 0; i < Filas.length; i++) {
            for (int j = 0; j < Filas.length; j++) {
                Filas[i][j] = "L";

            }

        }

    }

    public void mostrar() {
        //mostrar el array por terminal
        for (int i = 0; i < Filas.length; i++) {
            for (int j = 0; j < Filas.length; j++) {
                System.out.print(Filas[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public void registrar(int f, int c) {
        //cambiar la L por X de acuerdo a la seleccion
        int fila = f - 1;
        int columna = c - 1;

        String a = Filas[fila][columna];
        if (a == "X") {
            System.out.println("el asiento ya esta ocupado...haz otra seleccion");
        } else {

            Filas[fila][columna] = "X";
            System.out.println("boleto registrado, gracias por su compra...");
        }
    }

    public boolean validar(int f, int c) {
        //valida si el campo es L o X
        int fila = f - 1;
        int columna = c - 1;
        String a = Filas[fila][columna];
        if (a == "X") {
            return false;
        } else {
            return true;
        }

    }

}
