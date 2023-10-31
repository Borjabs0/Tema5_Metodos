import java.util.Random;
public class Ejercicio11 {
	public static void main(String[] args) {
        	
	
        	int aleatorio = 0;
		quiniela(aleatorio);
    	}
	
	public static int quiniela(int aleatorio) {
		
		Random rnd = new Random();
		for(int i = 1; i <= 15 ;i++) {
 			aleatorio = rnd.nextInt(3);
			if (aleatorio == 0) {
                		System.out.println("Partido " + i + "\t" + "1");
           		} else if (aleatorio == 1) {
                		System.out.println("Partido " + i + "\t" + "2");
            		} else {
                		System.out.println("Partido " + i + "\t" + "x");
            		}
	
		}

        	return aleatorio;
	}
        
   
}