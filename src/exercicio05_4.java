
import java.util.Scanner;

public class exercicio05_4 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		double peso;
		boolean isMenosPesado;
		
		System.out.print("Peso = ");
		peso = javaIn.nextDouble();
		
		isMenosPesado = peso < 60;
		
		System.out.println("O peso da pessoa é menor que 60kg ? " + isMenosPesado);
		
	}
}
