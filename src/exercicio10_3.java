
import java.util.*;

public class exercicio10_3 {
	
	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		int idade;
		double peso;
		double altura;
		
		int contadorIdade = 0,
			contadorAltura = 0,
			contadorPeso = 0;
			
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("-----------------");
			System.out.println("Pessoa " + i + "\n");
			
			System.out.print("> Digite a idade: ");
			idade = javaIn.nextInt();
			
			System.out.print("> Digite a altura: ");
			altura = javaIn.nextDouble();
			
			System.out.print("> Digite o peso: ");
			peso = javaIn.nextDouble();
			
			if(idade > 50) {
				contadorIdade ++;
			}
			
			if(altura >= 1 && altura <= 2) {
				contadorAltura++;
			}
			
			if(peso < 40) {
				contadorPeso++;
			}
		}
		
		System.out.println("\n* Número de pessoas com mais de 50 anos: " + contadorIdade);
		System.out.println("* Número de pessoas com menos de 40kg: " + contadorPeso);
		System.out.println("* Número de pessoas com altura entre 1m e 2m: " + contadorAltura);
	}
}