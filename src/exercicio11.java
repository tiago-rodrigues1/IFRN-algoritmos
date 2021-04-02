
import java.util.*;

public class exercicio11 {
	
	static Scanner javaIn = new Scanner(System.in);

	public static void main(String[] args) {
		int op = 0;
		
		while(op != 4) {
			System.out.println("Selecione uma opção: ");
			System.out.println("[1] Matriz");
			System.out.println("[2] Par ou Ímpar");
			System.out.println("[3] Maior número");
			System.out.println("[4] Sair");
			
			
			System.out.print ("\n* Opção: ");
			op = javaIn.nextInt();
			System.out.println();
			
			Control(op);
		}
		

	}
	
	public static void Control(int op) {
		
		switch (op) {
			case 1:
				System.out.print("* Digite o valor da altura: ");
				int altura = javaIn.nextInt();
				
				System.out.print("* Digite o valor da largura: ");
				int largura = javaIn.nextInt();
				
				Matriz(altura, largura);
				
				break;
				
			case 2:
				System.out.print("* Digite um número: ");
				int num = javaIn.nextInt();
				
				System.out.println("\n> " + num + " é " + ParOuImpar(num) + "\n");
				
				break;
				
			case 3:
				System.out.print("* Digite o 1° número: ");
				int n1 = javaIn.nextInt();
				
				System.out.print("* Digite o 2° número: ");
				int n2 = javaIn.nextInt();
				
				System.out.print("* Digite o 3° número: ");
				int n3 = javaIn.nextInt();
				
				System.out.println("\n> O maior número é " + MaiorNum(n1, n2, n3) + "\n");
				
				break;	
			
			default:
				System.out.println("\n> Comando inválido!\n");
				
				break;
		}
	}
	
	public static void Matriz(int h, int l) {
		System.out.println();
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < h; j++) {
				System.out.print("0 ");
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
	
	public static String ParOuImpar(int n) {
		return n % 2 == 0 ? "PAR" : "IMPAR";
	}
	
	public static int MaiorNum(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
			
		} else if (n2 > n1 && n2 > n3) {
			return n2;
			
		} else {
			return n3;
		}
	}
	

}
