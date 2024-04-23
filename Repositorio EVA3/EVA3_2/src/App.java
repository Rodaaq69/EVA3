public class App {
    public static void main(String[] args) throws Exception {
        int datos[] = new int[10];

        for(int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() *100);
        }
        for(int i = 0; i < datos.length; i++) {
        System.out.print("{"+datos[i]+"}");
        }
    }
}
