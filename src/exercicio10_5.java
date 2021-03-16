
import java.util.*;

public class exercicio10_5 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		System.out.print("Digite o valor investido: ");
		double valorInvestido = javaIn.nextDouble();
		
		System.out.print("Digite a taxa de rentabilidade: ");
		double rentabilidade = javaIn.nextDouble();
		
		System.out.print("Digite a quantidade de meses: ");
		double nMeses = javaIn.nextDouble();
		
		double  montante = valorInvestido * Math.pow((1 + (rentabilidade/100)), nMeses);
		double juros = montante - valorInvestido;
		
		System.out.println("\nMontante: R$" + montante);
		System.out.println("Juros: R$" + juros);

	}

}
