import java.util.Scanner;
public class Ejercicio17  {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char caracter;
		int ancho, alto; //Definimos ancho y alto com enteros no tienen nada que ver con el ancho y alto que esta definido en metodo rectangulo
		System.out.println("Dime el ancho del rectangulo");
		ancho= Integer.parseInt(scanner.nextLine());
		System.out.println("Dime la altura del rectangulo");
		alto= Integer.parseInt(scanner.nextLine());
		System.out.println("Dime un caracter");
		caracter = scanner.nextLine().charAt(0);
		
		scanner.close();
		
		rectangulo(ancho, alto, caracter);
	}
		public static void rectangulo(int ancho, int alto, char caracter){

			for(int i = 0; i < alto ; i++){
				for(int j = 0; j < ancho; j++){
					System.out.print(caracter);
				}
				System.out.println();  // Salto de línea para cambiar de fila
			}
        }	
}