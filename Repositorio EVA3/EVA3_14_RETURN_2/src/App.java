import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un valor que quieras potenciar:");
        int var=read.nextInt();
        System.out.println("Ingrese el numero de la potencia:");
        int pot=read.nextInt();

        System.out.println(var+"^"+pot+"="+potencia(var,pot));
    }
    public static int potencia(int var,int pot){
        int acum=1;
        for(int i=0;i!=pot;i++){
           acum= acum*var;
        }
        return acum;
    }
}
