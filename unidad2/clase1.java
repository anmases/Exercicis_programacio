package unidad2;

import java.util.Scanner;

public class actividad1 {

	public static void main(String[] args) {
	double precio = 50.0;
	Scanner lector = new Scanner(System.in);
	
	System.out.println("introduce el código promocional");
	String codigo = lector.nextLine();
	
	switch (codigo) {
	case "PlusOro": {
	System.out.println("el precio final es:" +(precio-25));
	break;
	}
	case "Platino33": {
		System.out.println("el precio final es:" + (precio-20));
		break;
			}
	case "100Max": {
		System.out.println("el precio final es:" + (precio-15));
		break;
	}
	case "SuperSilver":{
		System.out.println("el precio final es:" + (precio-10));
		break;
	}
	case "TotalBronce":{
		System.out.println("el precio final es:" + (precio-5));
		break;
		}
	default:{System.out.println("el código promocional no existe");
		
	}

	}
lector.close();
	}
}
