package sumar_arrays;
import java.util.Scanner;

public class classSumarArray {

    public void sumarArray(String a) {

        Scanner sc = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] array3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.print(array3[i] + ", ");


        }
        System.out.println(a);
        String sum = sc.nextLine();
        System.out.println(sum);
        
    }
    
}
