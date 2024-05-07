import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int valor1, valor2, resu;
        System.out.println("Ingrese dos valores los cuales quiera sumar\n Ingrese el primer valor:");
        valor1= read.nextInt();
        System.out.println("Ingrese el segundo valor:\n");
        valor2= read.nextInt();
        System.out.println(valor1+"+"+valor2+"="+ suma(valor1,valor2));
    }

    public static int suma(int a, int b){
        int resultado = a + b;
        return resultado;
    }
}
