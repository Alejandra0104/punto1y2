import java.util.Scanner;

public class Metodo 
{
    public static int[] buscarPorTitulo(Obj[][] m) 
    {
        Scanner sc = new Scanner(System.in);
        String producto;
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
    public static int HacerInventario(Obj[][] m)
    {
        int total = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] != null) {
                    total += m[i][j].getCant();
                }
            }
        }
        return total;
    }
}
