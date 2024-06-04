import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la distancia en km: ");
        float distancia = sc.nextFloat();
        
        System.out.print("Ingresa el tiempo en horas: ");
        float tiempo = sc.nextFloat();
        
        float velocidad = distancia / tiempo;
        
        System.out.printf("La velocidad es: %.2f km/h%n", velocidad);
        
        sc.close();
    }
}
