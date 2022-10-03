import java.util.Scanner;
public class Inversión {
    private static final int CIEN = 100;
	private static final double RETENCION = 0.18;
	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		double capitalFinal = 0.0, interes = 0.0;		
		System.out.println ("¿Qué cantidad de dinero desea invertir?");
		double inversion = dato.nextDouble();
		System.out.println ("¿Qué tipo de interés le ofrece su banco?");
		double redito = dato.nextDouble();
		System.out.println("¿durante cuanto tiempo?");
		double plazo = dato.nextDouble();
		interes = (inversion * redito * plazo)/CIEN;
		capitalFinal = inversion + (interes - interes * RETENCION);
		
		System.out.println("Su capital obtenido tras la inversión será:\t" + capitalFinal + "Euros");
		
		}

}
