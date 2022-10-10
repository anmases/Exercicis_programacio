import java.util.Scanner;
public class actividad3 {
	private static final int N = 54;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("introduzca un número");
		int numUser = lector.nextInt();
		
		while (numUser != N){
			
			if (numUser < N) {
				System.out.println("introduzca un número mayor");
				numUser = lector.nextInt();
				}
		    
		    else if (numUser > N){
		    	System.out.println("introduzca un número menor");
		    	numUser = lector.nextInt();
		    	}	
		
			
		}
		
		System.out.println("Has ganado");
		

	}

}
