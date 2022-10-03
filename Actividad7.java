
public class Actividad7 {
	
	private static final int CAPITAL= 2000;
	private static final double IMPUESTO = 0.18;
	private static final double REDITO = 0.0275;

	public static void main(String[] args) {
	double interes = 0.0, tiempo = 1.0, capitalFinal = 0.0;
	interes = CAPITAL * REDITO * tiempo;
	capitalFinal = CAPITAL + (interes- interes * IMPUESTO);
	System.out.println ("El capital final obtenido es de:" + capitalFinal + "Euros");
	}

}
