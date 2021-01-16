package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     int n1 = 0;
     int num_caracteristicas = 0;
     Scanner in = new Scanner(System.in);
     
     System.out.println("Porfavor ingrese el numero");
     n1 = in.nextInt();
     
     System.out.println("El numero introducido es: " + n1);
     System.out.println("doble de " + n1 + " -> " + 2 * n1);
     System.out.println("triple de " + n1 + " -> " +3 * n1);
    
    }
}
