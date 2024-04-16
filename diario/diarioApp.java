public class diarioApp {

    public static void main(String[] args) {

            diarioClass elias = new diarioClass("hugo", 500);


            diarioClass belen = new diarioClass("belen", 200);

            nombrar();
            elias.bono(10);
            elias.recompensa();
            belen.recompensa();
            elias.bono(20);
            belen.recompensa();
            elias.recompensa();

    }
    private static void nombrar(){
        System.out.println("hola desde el metodo nombrar");
    }
}