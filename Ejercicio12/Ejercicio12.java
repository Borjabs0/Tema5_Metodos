import java.util.Random;

public class Ejercicio12 {

    public static void main(String[] args) {
        int[] calificaciones = new int[50]; // Crear un arreglo para almacenar las calificaciones

        // Generar 50 calificaciones al azar entre 0 y 10
        Random rnd = new Random();
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = rnd.nextInt(11); // Números aleatorios de 0 a 10
        }

        // Calcular y mostrar el equivalente alfabético de las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            int calificacion = calificaciones[i];
            String equivalente = calificacionAlfabetica(calificacion);
            System.out.println("Calificación: " + calificacion + " Equivalente: " + equivalente);
        }
    }

    public static String calificacionAlfabetica(int calificacion) {
        if (calificacion < 5) {
            return "INSUFICIENTE";
        } else if (calificacion < 6) {
            return "SUFICIENTE";
        } else if (calificacion < 7) {
            return "BIEN";
        } else if (calificacion < 9) {
            return "NOTABLE";
        } else {
            return "EXCELENTE";
        }
    }
}
