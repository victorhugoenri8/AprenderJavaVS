//genera un DNI aleatorio el letras Mayusculas 

public class generarDNI {
    

    public String generarDni() {
        final int divisor = 23;
 
         String DNI;
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
        System.out.println("desde generar Dni " + numDNI);
 
        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
        return DNI;
    }
 



    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
}