import java.util.Scanner;
public class ModeloDeInventario {
    public static void main (String[]args){
        Scanner lector = new Scanner (System.in);
        System.out.println("\n \n \t \tMenu");
        System.out.println("Opcion 1: Modelo de EUQ clasico: ");
        System.out.println("Opcion 2: Modelo de inventarios con DESCUENTO: ");
        System.out.println("Opcion 3: Salir");
        System.out.println("Ingrese la opcion que desea:");
        int opcion = lector.nextInt();
        switch (opcion){
            case 1:
                int k; //costo de pedido
                int d; //demanda
                int h; //costo de almacenamiento
                int l; //tiempo de entrega del pedido
                int n; //numero de periodos
                double y; //cantidad optima del pedido
                double to; //duracion del ciclo
                double Le; //tiempo efecticvo de entrega
                double r; //punto de reorden
                double TCU; //costo total de inventario
                System.out.println("Dame el costo del pedido: ");
                k = lector.nextInt();
                System.out.println("Dame la demand: ");
                d = lector.nextInt();
                System.out.println("Dame el costo de almacenamiento: ");
                h = lector.nextInt();
                System.out.println("Dame el tiempo de entrega del pedido: ");
                l = lector.nextInt();
                //sacando la cantidad optima del pedido
                y=Math.sqrt((2*k*d)/h);
                //sacando la duracion del ciclo 
                to= y/d;
                //sacando el tiempo efectivo de entrega
                //primero sacamos n
                n=(int)(l/to);
                // se saca el tiempo efectivo de entrega
                Le=l-(n*to);
                // Sacando el punto de reorden
                r=Le*d;
                // Finalmente sacando el costo total de inventario
                TCU=((k*d)/y)+(h*(y/2));
                // Sacando resultados 
                System.out.println("La cantidad optima del pedido es: "+y);
                System.out.println("La duracion del ciclo es: "+to);
                System.out.println("El tiempo efectivo de entrega es: "+Le);
                System.out.println("El punto de reorden es: "+r);
                System.out.println("El costo total de inventario es: "+TCU);
                break;
            case 2:
            



             
                



        }

        


    }
}