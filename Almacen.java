import java.util.Scanner;

public class Almacen 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        Metodo met = new Metodo();
        int n = 0, opc;
        System.out.print("Ingrese la dimesion de la matriz: ");
        n= sc.nextInt();
        sc.nextLine();

        Obj [][] m = new Obj [n][n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                System.out.println("Producto en [" + i + "] [" + j + "]" );

                System.out.print("ingrese el nombre del producto: ");
                String nombre = sc.nextLine();

                System.out.print("ingrese su valor: ");
                Double vr = sc.nextDouble();

                System.out.print("ingrese la cantidad: ");
                int cant = sc.nextInt();
                sc.nextLine();

                m[i][j] = new Obj(nombre, vr, cant);
            }
        }

        do { 
             System.out.println("\n********** MENÚ ***********"
                             + "\n1. Buscar el producto"
                             + "\n2. Hacer inventario de todo el almacen"
                             + "\n3. Salir" );
            System.out.print("Ingrese la opción que desea realizar: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    int [] pos = met.buscarPorTitulo (m);

                    if (pos != null) 
                    {
                        System.out.println("Producto encontrado en: ");
                        System.out.println("Fila: " + pos[0]
                                        +"\nColumna: " + pos[1]);
                    } else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 2:
                    int inventario = met.HacerInventario(m);
                    System.out.println("Inventario total: " + inventario);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opción que ingresó, no es valida; reintente");
            }
        }
       while(opc != 3);
    }
}
