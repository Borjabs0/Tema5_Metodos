import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
		char letra;
		int numero;
		System.out.println("Dime el numero a sustituir");
		numero= Integer.parseInt(scanner.nextLine());
		System.out.println("Dime un caracter de sustitucion");
		letra = scanner.nextLine().charAt(0);
		System.out.println(primerDigito(numero, letra));
	}
		public static String primerDigito(int numero, char caracter){
			String resultado = "";

			for(int i = 0; i <= 9; i++){
				for(int j = 0; j <= 9; j++){
					for(int k = 0; k <= 9; k++){
						for(int l = 0; l <= 9; l++){
							resultado += i + "-" + j + "-" + k + "-" + l + "\n";
						}
					}
				}
			}
			String salida = resultado.replaceAll(String.valueOf(numero), String.valueOf(caracter));
			return salida;
        	}	

    
}