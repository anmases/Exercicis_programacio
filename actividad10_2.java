import java.util.Scanner;

public class actividad10_2 {

	public static void main(String[] args) {
		//Este es el mismo ejercicio anterior con for
		Scanner lector= new Scanner(System.in);
		System.out.println("escriba un caracter");
         String caracter1 = lector.nextLine();
         
         System.out.println("¿cuantas veces desea repetir dicho caracter?");
         int num = lector.nextInt();
         
         for (int i=0; i!=num; i++) {
        	 System.out.print(caracter1);
         }
	}

}
