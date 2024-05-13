import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Programa que calcula si un año es bisiesto");
        System.out.println("Ingresa el año");
        Scanner read = new Scanner(System.in);
        int año=read.nextInt();
        if(esBisiesto(año)==true){
            System.out.println("Es bisiesto");
        }else {
            System.out.println("No es bisiesto");
        }
        
    }
    public static boolean esBisiesto(int año){
        if (año%100 != 0 && año%4==0 || año%4==0 && año%400==0 ) {
            return true;
        }else{
            return false;
        }
        
    }
}
