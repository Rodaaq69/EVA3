public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo =  {5};
        int x =100;
        System.out.println("Antes de la operacion: " + x);
        sumarUno(x);
        System.out.println("Despues de la opercacion: " + x);
    }
    public static void sumarUno(int valor){
        System.out.println("Antes de la operacion: " + valor);
        valor=valor+1;
        System.out.println("Despues de la opercacion: " + valor);
    }
    public static void modificarArreglo(int[]arreglo){
        for(int i=0; i<arreglo.length; i++){
        
        }
    }
}
