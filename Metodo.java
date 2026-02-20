import java.util.Scanner;

public class Metodo 
{
    public static int[] buscarPorTitulo(obj [][] m) 
    {
        Scanner sc = new Scanner(System.in);
        String producto;
        sc.nextLine();
        System.out.print("Ingrese el producto que busca: ");
        producto = sc.nextLine().toLowerCase();
        
        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
        
                if ( m[i][j] != null && m[i][j].getNombre().equals(producto)) 
                {
                    return new int [] {i,j};
                } 
            }
        }
        return null; // no lo encontró
    }
}
