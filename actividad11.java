import java.util.Scanner;
import java.util.Random;

public class actividad11 {

	public static void main(String[] args) {
		Random num = new Random();
String letras="a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z";

        int x = num.nextInt(30);
        
        for (int i=0; i!=x; i++) {
        System.out.println(letras);	
        }

	}
}
