
import java.util.*;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		Random aleatorioNum = new Random();
		
		int resp, det;
		int diagPrincipalValor = 1, diagSecundariaValor = 1;
		
		System.out.println("Digite: ");
		System.out.println("[1] Para matriz 2x2");
		System.out.println("[2] Para matriz 3x3");
		
		System.out.print("Quero uma matriz [1/2]: ");
		resp = javaIn.nextInt();
		
		if(resp == 1) {
			System.out.println("\nMatriz 2x2\n");
			
			for(int i = 1; i <= 2; i++) {
				for(int j = 1; j <= 2; j++) {
					int num = -9+aleatorioNum.nextInt(9);
					
					System.out.print(num + " ");
					
					if(i == j) {
						diagPrincipalValor *= num;
					}
					
					//tamanho = 2
					if(i + j == 2 + 1) {
						diagSecundariaValor *= num;
					}
				}
				
				System.out.println();
			}
			
			det = diagPrincipalValor - diagSecundariaValor;
			
			System.out.println("Valor da determinante é: " + det);
			
		} else if(resp == 2) {
			System.out.println("\nMatriz 3x3\n");
			
			int principal_Paralela1_Valor = 1, principal_Paralela2_Valor = 1;
			int secundaria_Paralela1_Valor = 1, secundaria_Paralela2_Valor = 1;
			
			for(int i = 1; i <= 3; i++) {
				for(int j = 1; j <= 3; j++) {
					int num = -9+aleatorioNum.nextInt(9);
					
					System.out.print(num + " ");
					
					//Sentido da diagonal principal
					if(i == j) {
						diagPrincipalValor *= num;
					}
					
					if(i == 1 && j == 2 || i == 2 && j == 3 || i == 3 && j == 1) {
						principal_Paralela1_Valor *= num;
					}
					
					if(i == 1 && j == 3 || i == 2 && j == 1 || i == 3 && j == 2) {
						principal_Paralela2_Valor *= num;
					}
					
					//Sentido da secundária
					if(i + j == 3 + 1) {
						diagSecundariaValor *= num;
					}
					
					if(i == 1 && j == 1 || i == 2 && j == 3 || i == 3 && j == 2) {
						secundaria_Paralela1_Valor *= num;
					}
					
					if(i == 1 && j == 2 || i == 2 && j == 1 || i == 3 && j == 3) {
						secundaria_Paralela2_Valor *= num;
					}
				}
				
				System.out.println();
			}
			
			int sentidoPrincipal = diagPrincipalValor + principal_Paralela1_Valor + principal_Paralela2_Valor;
			int sentidoSecundaria = -diagSecundariaValor - secundaria_Paralela1_Valor - secundaria_Paralela2_Valor;
			
			det = sentidoPrincipal + sentidoSecundaria;
			
			System.out.println("Valor da determinante é: " + det);
			
		} else {
			System.out.println("Valor inválido");
		}

	}

}
