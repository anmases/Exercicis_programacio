package unidad2;
import java.util.Scanner;

public class actividad3 {

	public static void main(String[] args) {
		int numero = -1, maximo = 0;
		
		Scanner lector = new Scanner(System.in);
		
		
		do {

			numero = lector.nextInt();
			
			if (numero > maximo) {maximo = numero;
				
			}
			
			
		} while (numero!=0);
		System.out.println("el número máximo introduicido es:" +maximo);
		lector.close();
	}

}
