public class Ejercicio5{
    public static void main(String[] args) {
        char caracter = '*';
        int veces = 5;

        imprimirCaracter(caracter, veces);
    }

	// Método para imprimir un carácter un número determinado de veces
   	public static void imprimirCaracter(char a, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            	System.out.print(a);
        }
	System.out.println();
	System.out.println("Número de veces que se imprime a: " + cantidad);
        System.out.println(); // Salto de línea al final para separar la salida
    }
}
