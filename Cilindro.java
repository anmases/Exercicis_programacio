
public class Cilindro {

	private static final double PI = 3.1415;
	private static final int DOS = 2;
	public static void main(String[] args) {
		double d = 15.5, a = 0.0, h = 42.4, v = 0.0;
     a = PI * d *h;
     v = PI * (d/DOS)* (d/DOS) * h;
     System.out.println("El Area del cilindro es:" + a + "centímetros cuadrados");
     System.out.println("El volumen del cilindro es:" + v + "centrímetros cúbicos");
	}

}
