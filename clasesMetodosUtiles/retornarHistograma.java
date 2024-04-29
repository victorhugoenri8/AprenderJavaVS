public class retornarHistograma {
 public static void main(String[] args) {
    System.out.println(" ");
    char equis = 'X';
    int[] num = { 2, 5, 1, 7, 6, 2, 4, 6, 10 };
    for (int i = 0; i < num.length; i++) {
     
    String hist="";
        int acum= num[i];
        for (int j = 0; j < acum;j++) {

           hist=hist + equis;
            
            
        }
        
        System.out.println(hist);
    }
}

    
}
