import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el texto");
        String text=read.nextLine();
        System.out.println("Cual es el numero a calcular la sumatoria");
        int cant=read.nextInt();
        int sumatoria=0;
        for(int i=0; i<=cant; i++){
            sumatoria=sumatoria+i;
        }
        System.out.println("El valor de la sumatoria de "+cant+" = "+sumatoria);

        System.out.println("Ingrese la cantidad de filas");
        int filas=read.nextInt();
        for(int i=1; i<=filas; i++){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    

}
