
import java.util.Scanner;

public class exercicio05_6 {
	
	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		char genero;
		boolean isMasculino;
		
		System.out.print("Gênero: ");
		genero = javaIn.next().charAt(0);
		
		isMasculino = genero == 'm';
		
		System.out.println("A pessoa tem gênero masculino ? " + isMasculino);
	}
}