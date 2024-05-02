import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner (System.in);
        int cant= read.nextInt();
        String[] listaNombre = new String[cant];
        for(int i=0; i<listaNombre.length; i++){
            System.out.println("Nombre #"+(i+1)+":");
            listaNombre[i]= read.nextLine();
        }
        for(int i=0; i<listaNombre.length; i++){
            System.out.println(listaNombre[i]);
        }
    }
}
