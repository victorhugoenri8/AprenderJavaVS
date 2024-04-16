package upcasting2;

public class Principal {
    public static void main(String[] args) {
       Ave aveAR1 = new AguilaReal("Real1", 30, 55); 
    //    en el upcastinig solo se queda con los metodos que tiene el padre 
    //    pero con el comportamieento que le dimos en el hijo
    //    no encontraremos ni los atributos ni los metodos del hijo, es como que los oculta para 
    //    comportarse como padre
        // aveAR1.volar();
        // aveAR1.pico();
        // System.out.println(aveAR1.nombre);
        // aveAR1.soloPadre();

        //////////////////////////////////
        // cuando hacemos downcasting del objeto regresa a tener los 
        // atributos y metodos que se ocultaron con el upcasting
        AguilaReal segunda= (AguilaReal)aveAR1;

        System.out.println(segunda.nombre);

        Pato hPato = new Pato("soyPato", 2);

        aveAR1.pato1(hPato);

       segunda.pato1(hPato);

        


    }
}
