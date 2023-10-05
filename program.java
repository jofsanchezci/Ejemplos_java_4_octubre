import java.util.Scanner;

public class program{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            System.out.println("El XXXX no está definido para números negativos.");
        } else {
            long n = 1;
            
            for (int i = 1; i <= numero; i++) {
                n *= i;
            }
            
            System.out.println("El XXX de " + numero + " es " + n);
        }
        
        scanner.close();
    }
}
