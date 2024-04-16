public class arraypareimpar {
    //llenar array multidimensional con numeros pares e impares
    public static void main(String[] args) {
        int [] [] primero = new int[5] [5];
        
        
        int b=1;
        int c = 1;
        for (int i = 0; i < primero.length; i++) {
            for (int j = 0; j < primero[i].length; j++) {
                if (i%2==0) {
                    System.out.print(primero[i][j]=b*3);
                    
                    System.out.print(", ");
                    b++;
                }if (i%2==1){

                  System.out.print(primero[i][j]=c*2);
                    
                    System.out.print(", ");
                    c++;
                }

            }
            
            System.out.println("-----");
        }
        
           


    }
    
}
