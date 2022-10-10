package unidad2;
import java.util.Scanner;

public class actividad2 {

	public static void main(String[] args) {
		int valorInicial = 0, valorFinal = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("introduce el valor inicial");
		valorInicial = lector.nextInt();
		lector.nextLine();
		System.out.println("introduce el valor final");
		valorFinal = lector.nextInt();
		
		
		while(valorInicial < valorFinal) 
		//primera forma
		{valorInicial=valorInicial+1;
		//segunda forma
		//valorInicial +=1;
		//tercera forma
		//valorInicial ++;
             System.out.println("El valor actual es:" + valorInicial);
		}
	}

}
