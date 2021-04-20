
import java.util.*;

public class extra {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Digite seu nome: ");
		String nome = javaIn.nextLine();
		
		int tamanho = nome.length();
		
		for(int i = 1; i <= tamanho; i++) {
			for(int j = 1; j <= tamanho; j++) {
				
				if(i == j || i + j == tamanho + 1) {
					char letra = nome.charAt(contador);
					System.out.print(letra + " ");
					
				} else {
					System.out.print("0 ");
				}
				
			}
			
			contador+=1;
			
			System.out.println();
		}

	}

}
