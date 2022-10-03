import java.util.Scanner;
public class conversor {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner (System.in);
				
		System.out.println("Conversor de unidades de tiempo");
		System.out.println("Escriba una cantidad de tiempo en SEGUNDOS");
		double input = lector.nextDouble();
		double dias = 0.0, horas = 0.0, minutos = 0.0, segundos = 0.0;
		dias = input/60/60/24;
		horas= input/60/60;
		minutos = input/60;
		segundos = input;
		
		System.out.println(dias + "dias");
		System.out.println (horas + "horas");
		System.out.println (minutos + "minutos");
		System.out.println (segundos + "segundos");
		
		
		
		
		
		
		
		
		

	}

}
