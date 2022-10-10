import java.util.Random;

public class actividad5 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		Random numeroUno = new Random();
		
		int suma=0;
		
		int contador = 0;
		
		do {
			n1 = numeroUno.nextInt(1000);
			n2 =numeroUno.nextInt (1000);
			suma=suma+n1+n2;
		System.out.println(suma);
		contador=contador+1;
		} while (contador<=20);		}

}
