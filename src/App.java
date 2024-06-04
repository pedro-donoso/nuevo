import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edad = 34;
        String nombre = "William";
        String salida = String.format("%s tiene %d años.", nombre, edad);
        System.out.println(salida);
        sc.close();
    }
}
