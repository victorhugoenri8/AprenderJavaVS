package programa_preguntas;
import java.util.Scanner;

public class clase1 {
    
    //atributos
      private int puntos = 0;
    
      Scanner es = new Scanner(System.in);
     
     

  
    public void pregunta(String pregunta,  String opcion1,String opcion2, String opcion3, String respuesta1 ){ 
      
      System.out.println(pregunta + "\n" + opcion1 + "\n" + opcion2 + "\n" + opcion3 );
            if (es.nextLine().equals(respuesta1)) {
              System.out.println("correcto");
              puntos++;
            } else {
              System.out.println("error");
            }
    }

    

    public int puntos(){
      return puntos;
    }
}
