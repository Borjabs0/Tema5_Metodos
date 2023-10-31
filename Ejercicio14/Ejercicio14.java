import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Introduce el valor de m: ");
        int m = scanner.nextInt();

        if (n >= m && n >= 0 && m >= 0) {
            long resultado = calcularCombinatorio(n, m);
            System.out.println("El número combinatorio " + n + " sobre " + m + " es: " + resultado);
        } else {
            System.out.println("Valores de n y m no válidos.");
        }
    }

    public static long calcularCombinatorio(int n, int m) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
