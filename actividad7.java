import java.util.Scanner;
public class actividad7 {

	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.println("introduce un número");
	int n1 = lector.nextInt();
	System.out.println("introduce otro número");
	int n2 = lector.nextInt();
	
	if (n1>n2) {System.out.println("el mayor de ambos es\t" +n1);
	}
	else {System.out.println("el mayor de ambos es\t" +n2);
	}

	}

}
