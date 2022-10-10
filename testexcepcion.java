import java.util.Scanner;

public class testexcepcion {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
int numero = 0;

try {System.out.println("introduce un número entero");
numero=lector.nextInt();
	
} catch (java.util.InputMismatchException e) {
	System.out.println("Error. el número introducido no es entero");
}


lector.close();

	}

}
