import java.util.Scanner;

public class Almacen 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        obj o = new obj();
        Metodo met = new Metodo();
        int n = 0;
        System.out.print("Ingrese la dimesion de la matriz: ");
        n= sc.nextInt();
        sc.nextLine();

        obj [][] m = new obj [n][n];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                
                System.out.println("Producto en [" + i + "] [" + j + "]" );

                System.out.print("ingrese el nombre del producto:");
                String nombre = sc.nextLine();

                System.out.print("ingrese su valor: ");
                Double vr = sc.nextDouble();

                System.out.print("ingrese la cantidad: ");
                int cant = sc.nextInt();
                sc.nextLine();

                m[i][j] = new obj(nombre, vr, cant);
            }
        }

        int [] pos = met.buscarPorTitulo (m);

        if (pos != null) 
        {
            System.out.print("producto encontrado en: ");
            System.out.println("fila: " + pos[0]
                              +"\ncolumna: " + pos[1]);
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
