import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int num1 = Integer.parseInt(lector.nextLine());
        System.out.println("Dime un numero: ");
        int num2 = Integer.parseInt(lector.nextLine());
	System.out.println("Dime un numero: ");
        int num3 = Integer.parseInt(lector.nextLine());
 	System.out.println("Dime un numero: ");
        int num4 = Integer.parseInt(lector.nextLine());

        if(calcularCapicua(num1, num2, num3, num4)){
		System.out.println("La secuencia intrducida es capicua");
	}
	else{
        	System.out.println("La secuencia intrducida no es capicua");
	}
        lector.close();
    }

    public static boolean calcularCapicua(int num1, int num2, int num3, int num4) {
        return num1 == num4 && num2 == num3;
        
    }
}