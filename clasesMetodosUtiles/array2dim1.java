public class array2dim1 {
    public static void main(String[] args) {
        int [] [] primero = new int[4] [5];
        int cont = 1;
        for (int i = 0; i < primero.length; i++) {
            System.out.println(cont + " fila ");
            for (int j = 0; j < primero[i].length; j++) {
                int aleatorioFilas = (int) (Math.random() * 10);
                primero[i][j] = aleatorioFilas;
                System.out.print(primero[i][j]+", ");
            }
            cont=cont + 1;
            System.out.println("-----");
        }

        // for (int i = 0; i <4; i++) {
            
        //     for (int j = 0; j <5; j++) {
        //         System.out.print(primero[i][j]+ ", ");
        //     }
        //     System.out.println();
        // }
    }
    
}
