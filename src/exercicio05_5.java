
import java.util.Scanner;

public class exercicio05_5 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		String meuNome = "Tiago", nomePessoa;
		boolean isIgual;
		
		System.out.print("Nome: ");
		nomePessoa = javaIn.nextLine();
		
		nomePessoa = nomePessoa.toLowerCase();
		meuNome = meuNome.toLowerCase();
		
		isIgual = meuNome.equals(nomePessoa);
		
		System.out.println("O nome da pessoa é igual ao meu ? " + isIgual); 
	}
}
