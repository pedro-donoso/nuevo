import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("a + b es igual a %d \n", a+b);
        System.out.printf("a * b es igual a %d \n", a*b);
        sc.close();
    }
}
