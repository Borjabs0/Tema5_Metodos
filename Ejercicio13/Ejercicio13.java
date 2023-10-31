ublic class Ejercicio13 {
    public static void main(String[] args) {
        saludo("Pepe", "a"); // Llama al método de saludo con el nombre "Pepe" y el código de idioma "a" (Valenciano)
        saludo("Juan", "b"); // Llama al método de saludo con el nombre "Juan" y el código de idioma "b" (Castellano)
        saludo("Mary", "c"); // Llama al método de saludo con el nombre "Mary" y el código de idioma "c" (Inglés)
    }

    public static void saludo(String nombre, String idioma) {
        String mensaje = "";

        switch (idioma) {
            case "a":
                mensaje = "Buenos días " + nombre;
                break;
            case "b":
                mensaje = "Buenos días " + nombre;
                break;
            case "c":
                mensaje = "Good morning " + nombre;
                break;
            default:
                mensaje = "Idioma no reconocido";
        }

        System.out.println(mensaje);
    }
}