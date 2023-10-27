import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int number1 = Integer.parseInt(lector.nextLine());
        
        int factorial = calcularFactorial(number1);
        
        System.out.println("El factorial de " + number1 + " es " + factorial);
        
        lector.close();
    }

    // Método para calcular el factorial de un número
    public static int calcularFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}