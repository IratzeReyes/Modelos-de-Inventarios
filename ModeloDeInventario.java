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
                double h; //costo de almacenamiento
                int l; //tiempo de entrega del pedido
                int n; //numero de periodos
                double y; //cantidad optima del pedido
                double to; //duracion del ciclo
                double Le; //tiempo efecticvo de entrega
                double r; //punto de reorden
                double TCU; //costo total de inventario
                System.out.println("Dame el costo del pedido: ");
                k = lector.nextInt();
                System.out.println("Dame la demanda: ");
                d = lector.nextInt();
                System.out.println("Dame el costo de almacenamiento: ");
                h = lector.nextDouble();
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
                double i; //descuento
                double H; //costo de almacenamiento 
                int CU; //costo unitario
                double y2; //cantidad optima del pedido 
                double CTU; //costo total unitario
                String condicion; //condicion para el descuento
                int ofertas; //ofertas para analizar
                System.out.println("¿Cuantas ofertas tienes?: ");
                ofertas= lector.nextInt();
                System.out.println("Dame la demanda: ");
                d= lector.nextInt();
                System.out.println("Dame el costo del pedido: ");
                k= lector.nextInt();
                System.out.println("Dame el porcentaje de descuento: ");
                i= lector.nextDouble();
                
                double menorCTU= Double.MAX_VALUE;//este lo investigue para ver el menor costo total unitario mas rapido 
                int mejorOferta=0;
                for (int m=1; m<=ofertas; m++){
                    System.out.println("Numero de oferta: " +m);
                    System.out.println("Dame la condicion del descuento: ");
                    condicion= lector.next();
                    System.out.println("Dame el costo unidario: ");
                    CU= lector.nextInt();
                    //Sacamos el costo de almacenamiento 
                    H= (i/100)*CU;
                    //Sacando la cantidad optima del producto
                    y2= Math.sqrt((2*k*d)/H);
                    //Sacando el costo total unitario
                    CTU= (d*CU)+((k*d)/y2)+((H*y2)/2);
                    //Mostrar los resultados 
                    System.out.println("La cantidad optima del producto es: "+y2);
                    System.out.println("El costo total unitario de: " + m +"es: " +CTU);
                    System.out.println("Condicion del descuento: " +condicion);
                    //Encontrando la mejor oferta 
                    if (CTU < menorCTU){
                        menorCTU = CTU;
                        mejorOferta = m;
                    }
                }
                System.out.println("La mejor oferta es la numero: " +mejorOferta+ " con un costo total unitario de: " +menorCTU);
                break;
            case 3:
                System.out.println("Programa finalizado. Gracias por su uso...");
                break;
            default:
                System.out.println("Opcion no valida, intente de nuevo.");      
        }

        


    }
}