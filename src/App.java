import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Qué edad tienes?");
        int edad = sc.nextInt();
        if(edad >= 18) {
        System.out.println("Eres mayor de edad");
        }
        if(edad < 18) {
        System.out.println("Eres menor de edad");
        }
        
        
        sc.close();
    }
}
