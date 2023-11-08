import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fechaNacimiento = solicitarFechaNacimiento(scanner);
        int luckyNumber = calcularLuckyNumber(fechaNacimiento);

        System.out.println("El número de la suerte es: " + luckyNumber);

        scanner.close();
    }

    public static String solicitarFechaNacimiento(Scanner scanner) {
        System.out.print("Introduce tu fecha de nacimiento (dd-mm-aaaa): ");
        return scanner.nextLine();
    }

    public static int calcularLuckyNumber(String fechaNacimiento) {
        int sumatoriaDigitos = 0;

        for (int i = 0; i < fechaNacimiento.length(); i++) {
            char caracter = fechaNacimiento.charAt(i);
            if (Character.isDigit(caracter)) {
                sumatoriaDigitos += Character.getNumericValue(caracter);
            }
        }

        while (sumatoriaDigitos > 9) {
            int nuevoNumero = 0;
            while (sumatoriaDigitos > 0) {
                nuevoNumero += sumatoriaDigitos % 10;
                sumatoriaDigitos /= 10;
            }
            sumatoriaDigitos = nuevoNumero;
        }

        return sumatoriaDigitos;
    }
}
