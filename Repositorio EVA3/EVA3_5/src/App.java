public class App {
    public static void main(String[] args) throws Exception {
        int arreglo [] = new int[3];
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("["+arreglo[i] + "]");
        }

        arreglo =new int[5];
        System.out.println(arreglo);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println(" "); 
            System.out.println("Despues de modificarlos: ");
            System.out.println("["+arreglo[i] + "]");
            
        }
    }
}
