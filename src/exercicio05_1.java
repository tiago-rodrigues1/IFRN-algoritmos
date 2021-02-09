
import java.util.Scanner;;

public class exercicio05_1 {
	
	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		int idade;
		boolean isMaiorIdade;
		
		System.out.print("Idade = ");
		idade = javaIn.nextInt();
		
		isMaiorIdade = idade >= 18;
		
		System.out.println("A pessoa é maior de idade ? " + isMaiorIdade);
	}
}
