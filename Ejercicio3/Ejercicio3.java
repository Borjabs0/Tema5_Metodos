public class Ejercicio3{
    public static void main(String[] args) {
        double numero1 = 7.5;
        double numero2 = 5.2;

        double mayor = encontrarMayor(numero1, numero2);

        System.out.println("El número mayor es: " + mayor);
    }

    // Método para encontrar el número mayor entre dos números
    public static double encontrarMayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
