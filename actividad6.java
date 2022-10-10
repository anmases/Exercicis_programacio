import java.util.Scanner;
public class actividad6 {
    private static final double PI = 3.1415;
	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("Introduzca el radio");
	double radio = lector.nextDouble();
	
	System.out.println("El area del círculo es\t" +PI*radio*radio);
	System.out.println("La longitud del círculo es\t" + 2*PI*radio);

	}

}
