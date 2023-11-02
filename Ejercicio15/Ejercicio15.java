import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    palabraMasLarga(scanner);
                    break;
                case 2:
                    palabraMasCorta(scanner);
                    break;
                case 3:
                    numeroDeVocales(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Introduce una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("================");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir");
        System.out.print("Introduce opción: ");
    }

    public static void palabraMasLarga(Scanner scanner) {
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.print("Introduce la tercera palabra: ");
        String palabra3 = scanner.nextLine();

        String palabraMasLarga = palabraMasLargaEntreTres(palabra1, palabra2, palabra3);
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }

    public static String palabraMasLargaEntreTres(String palabra1, String palabra2, String palabra3) {
        String palabraMasLarga = palabra1;
        if (palabra2.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra2;
        }
        if (palabra3.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra3;
        }
        return palabraMasLarga;
    }

    public static void palabraMasCorta(Scanner scanner) {
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();
        System.out.print("Introduce la tercera palabra: ");
        String palabra3 = scanner.nextLine();

        String palabraMasCorta = palabraMasCortaEntreTres(palabra1, palabra2, palabra3);
        System.out.println("La palabra más corta es: " + palabraMasCorta);
    }

    public static String palabraMasCortaEntreTres(String palabra1, String palabra2, String palabra3) {
        String palabraMasCorta = palabra1;
        if (palabra2.length() < palabraMasCorta.length()) {
            palabraMasCorta = palabra2;
        }
        if (palabra3.length() < palabraMasCorta.length()) {
            palabraMasCorta = palabra3;
        }
        return palabraMasCorta;
    }

    public static void numeroDeVocales(Scanner scanner) {
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        int numVocales = contarVocales(palabra);
        System.out.println("El número de vocales en la palabra es: " + numVocales);
    }

    public static int contarVocales(String palabra) {
        palabra = palabra.toLowerCase(); // Convertir a minúsculas para contar las vocales sin importar la capitalización
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
}