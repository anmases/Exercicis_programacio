import java.util.Scanner;

public class sumar {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		System.out.println("vamos a sumar dos números");
		System.out.println("escribe el primer numero y presiona la tecla enter:");
		double primerNumero = lector.nextDouble();
		lector.nextLine();
		System.out.print("escribe el segundo número y presiona enter:");
		double segundoNumero = lector.nextDouble();
		lector.nextLine();
		double resultado = primerNumero + segundoNumero;
		System.out.println("la suma de los dos valores es " + resultado);
		}

}
