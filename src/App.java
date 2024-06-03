import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextLong();
        double result = Math.sqrt(numero);
        System.out.printf("La raíz cuadradad es: %f", result);
        sc.close();
    }
}
