
import java.util.*;

public class exercicio10_4 {
	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra: ");
		double valorCompra = javaIn.nextDouble();
		
		System.out.print("Digite a quantidade de prestações: ");
		double nPrestacoes = javaIn.nextDouble();
		
		System.out.println();
		
		double totalPago = 0;
		
		for(double i = 1; i <= nPrestacoes; i++) {
			
			double prestacaoSemJuros = valorCompra / nPrestacoes;
			double juros = prestacaoSemJuros * (i/100);
			double prestacaoComJuros = prestacaoSemJuros + juros;
			
			totalPago += prestacaoComJuros;
			
			System.out.println("Prestação " + i + " = " + prestacaoComJuros);
		}
		
		System.out.println("\n-TOTAL PAGO: R$" + totalPago);
		
	}
}
