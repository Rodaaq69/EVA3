public class App {
    public static void main(String[] args) throws Exception {
        String diasemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves","Viernes","Sabado"};

        char vocales[] = {'a','e','i','o','u'};

        System.out.println("tamaño de arreglo de los dias de la semana: "+ vocales.length);
        System.out.println("Tamaño del arreglo de las vocales: "+ diasemana.length);
        for(int i=0; i<diasemana.length; i++){
            System.out.println(diasemana[i]); 
        }
        for(int i=0; i<vocales.length; i++){
            System.out.println(vocales[i]);
        }

        String menu[]={"Archivo", "Nueva factura", "Modificar", "Salir"};
        for(int i=0; i<menu.length; i++){
            System.out.println(i+".-"+menu[i]);
        }
    }
}
