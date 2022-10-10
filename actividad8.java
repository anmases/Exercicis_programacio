import java.util.Random;
public class actividad8 {

	public static void main(String[] args) {
	Random i = new Random();	
    int contador = 0;
	int x =0, y=0, z=0;
	
	do {
		
		x = i.nextInt(1000);
		y= i.nextInt(1000);
		z= i.nextInt(1000);
		
	  if (x>y && x>z) {
	   		   System.out.println("El mayor es:\t" +x);
	  	  }
	   else if (y>x && y>z) {
		   			   System.out.println("El mayor es:\t" +y);
		   }
	   		   else if (z>x && z>y){
		   				   System.out.println("El mayor es:\t" +z);
			   }
		   
	   
		
	
		
			contador=contador+1;
	} while (contador!=20);

	}

}
