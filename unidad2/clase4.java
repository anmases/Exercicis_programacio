package unidad2;
import java.util.Scanner;
public class actividad4 {


	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int maximo = 0, suma = 0, sueldo = 0;
		
		//el bucle se ejecuta 10 veces
for (int i=1; i<=10; i++) {System.out.println("introduce el sueldo del empleado" +i);
sueldo = lector.nextInt();
suma += sueldo;

if (sueldo>maximo) {maximo=sueldo;
	
}
}
	}

}
