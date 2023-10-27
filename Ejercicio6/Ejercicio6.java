public class Ejercicio6{
    	public static void main(String[] args){
       

		String cadena = print('a', 3, 2);
		System.out.println(cadena);
	}

		public static String print(char c, int colums, int rows){
			String result = "";
			for(int i = 1; i <= rows; i++){
				for(int j = 1; j <= colums; j++){
					result = result + c;
				}
				result +="\n";
			}
			return result;
		}

   }
