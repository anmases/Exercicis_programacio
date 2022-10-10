package actividades_no_evaluables;
import java.util.Scanner;
public class actividad1 {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner lector = new Scanner(System.in);
		System.out.println("----------------MENÚ-----------------");
		System.out.println("1. Mantenimiento de clientes");
		System.out.println("2. Introducción de facturas");
		System.out.println("3. Listado de facturas");
		System.out.println("4. Finalizar");
		System.out.println("Seleccione una opción");
		
		opcion = lector.nextInt();
		switch (opcion) {
		case 1: {System.out.println("ha seleccionado mantenimiento de clientes");
		break;}
		case 2: {System.out.println("ha seleccionado Introducción de facturas");
		break;}
		case 3: {System.out.println("ha seleccionado Listado de facturas");
		break;}
		case 4: {System.out.println("ha seleccionado Finalizar");}	
		break;	
		default: {System.out.println("La opción introducida no está disponible");}
		return;	
		}
	}

}
