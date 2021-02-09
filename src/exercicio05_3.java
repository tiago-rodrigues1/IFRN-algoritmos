
import java.util.Scanner;

public class exercicio05_3 {
	
	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		double altura;
		boolean isMaisAlto;
		
		System.out.print("Altura = ");
		altura = javaIn.nextDouble();
		
		isMaisAlto = altura > 1.8;
		
		System.out.println("A pessoa é mais alta que 1.8m ? " + isMaisAlto);
		
	}
}
