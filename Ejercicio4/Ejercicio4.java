public class Ejercicio4{
    public static void main(String[] args) {
        double numero1 = 7.5;
        double numero2 = 5.2;
        double numero3 = 9.8;
        double numero4 = 6.4;

        double mayor = encontrarMayorDeCuatro(numero1, numero2, numero3, numero4);

        System.out.println("El número mayor es: " + mayor);
    }

    // Método para encontrar el número mayor entre cuatro números
    public static double encontrarMayorDeCuatro(double num1, double num2, double num3, double num4) {
        double max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        return max;
    }
}
