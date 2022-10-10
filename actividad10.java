import java.util.Scanner;
public class actividad10 {

	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);
		int contador=0;
		System.out.println("escriba un caracter");
         char caracter1 = lector.next().charAt(0);
         System.out.println("¿cuantas veces desea repetir dicho caracter?");
         int num = lector.nextInt();
         
         do {
        	 System.out.println(caracter1);
			
        	 contador=contador+1;
        	 
		} while (contador<=num);
         
}

}
