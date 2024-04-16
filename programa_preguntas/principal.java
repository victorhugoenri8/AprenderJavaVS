package programa_preguntas;

/**
 * dos
 */
public class principal {
    public static void main(String[] args) {
        
    int puntuacion = 0;
      
     clase1 hola = new clase1();
     clase1 segunda = new clase1();
     clase1 tercera = new clase1();
   
    hola.pregunta("quien es la perrita mas bonita?: ",
                                "a) lanita. ", 
                                "b) perro",
                                "c) gato",
                             "a");
    
    
    segunda.pregunta("pais donde vives?: ",
                                "a) canada. ", 
                                "b) mexico",
                                "c) uruguay",
                             "b");
        
       
    tercera.pregunta("cuantos lados tiene un cubo?: ",
                                "a) tres ", 
                                "b) dos",
                                "c) cuatro",
                             "c");
      
    puntuacion +=  hola.puntos() + segunda.puntos() + tercera.puntos();

    System.out.println("el total de tus puntos es: " + puntuacion);
    }

    

    
}