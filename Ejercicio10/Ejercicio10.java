import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1;
	do{
        	System.out.println("Si quiere terminar el proceso debe introducir un numero negativo. \nDime un numero: ");
        	num1 = Integer.parseInt(lector.nextLine());
 	if (num1 >= 0) {
		calculadora(num1);
            }
        } while (num1 >= 0);
        
	
	lector.close();
    }

    public static int calculadora(int number) {
		for (int i = 1; i <= 10; i++) {
             		int calculadora = number * i;
             		System.out.println(number + " x " + i + " = " + calculadora);
		
        	}
        return number;
        
    }
}