import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese una opcion para calcular la temperatura");
        System.out.println("1.-centigrados a fahrenheit\n2.-centigrados a Kelvin\n3.-fahrenheit a centigrados\n4.-Kelvin a fahrenheit\n5.-fahrenheit a Kelvin\n6.-Salir.");
        Scanner read = new Scanner(System.in);
        double temp=0;
        int opc=read.nextInt();

        switch(opc){
            case 1:
            System.out.println("Ingrese la temperatura");
            temp=read.nextDouble();
            System.out.println(centiFare(temp));
            break;
            case 2:
            System.out.println("Ingrese la temperatura");
            temp=read.nextDouble();
            System.out.println(centiKelv(temp));
            break;
            case 3:
            System.out.println("Ingrese la temperatura");
            temp=read.nextDouble();
            System.out.println(fareCenti(temp));
            break;
            case 4:
            System.out.println("Ingrese la temperatura");
            temp=read.nextDouble();
            System.out.println(kelvFare(temp));
            break;
            case 5:
            System.out.println("Ingrese la temperatura");
            temp=read.nextDouble();
            System.out.println(fareKelv(temp));
            break;
            case 6:
            break;
        }
        
    }
    public static double centiFare(double temp){
        return  (temp * 9/5) + 32 ;
    }
    public static double centiKelv(double temp){
        return temp+273.15;
    }
    public static double fareCenti(double temp){
        return (temp-32)/1.8;
    }
    public static double kelvFare(double temp){
        return (9*temp)-459.67;
    }
    public static double fareKelv(double temp){
        return (temp+459.67)/1.8;
    }
}
