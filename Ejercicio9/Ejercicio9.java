import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int num1 = Integer.parseInt(lector.nextLine());
  
		int sumario = calcularSumario(num1);
		System.out.println("El sumario de " + num1 + " es = " + sumario);
	
        lector.close();
    }

    public static int calcularSumario(int number) {
        int sumario = 0;
        for (int i = 1; i <= number; i++) {
            sumario += i;
        }
        return sumario;
        
    }
}