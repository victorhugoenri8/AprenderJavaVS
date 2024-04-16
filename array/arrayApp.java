package array;

public class arrayApp {
        public static void main(String[] args) {
            int col[]= new int[3];

            // col[0]=3;
            // col[1]=2;
            // col[2]=1;
            for (int index = 0; index < col.length; index++) {
                col[index] = index+1;
            }
            for (int i = 0; i < col.length; i++) {
               System.out.println(col[i]);
            }
        }
}
