import java.util.Scanner;
import java.util.Random;

public class ejercicio4 {

	public static void main(String[] args) {
		System.out.println("introduzca un número");
		Random numAleatorio = new Random();
		Scanner lector = new Scanner(System.in);
			int n = lector.nextInt();
			int numero = 0;
			
			
    do {
    	
    	numero = numAleatorio.nextInt(n);
     	
    }while (numero%2 != 0);
    System.out.println("el número aleatorio es\t" + numero);
    
}
}