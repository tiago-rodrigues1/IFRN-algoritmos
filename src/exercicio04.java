import java.util.Scanner;


public class exercicio04 {
	public static void main (String [] args) {
		Scanner javaIn = new Scanner(System.in);
		
		double valorCompra, desconto, juros;
		int numPrestacoes;
		
		// Insere os dados no sistema
		System.out.println("DIGITE O VALOR DA COMPRA: ");
		valorCompra = javaIn.nextDouble();
		
		System.out.println("DIGITE A QUANTIDADE DE PRESTAÇÕES: ");
		numPrestacoes = javaIn.nextInt();
		
		System.out.println("DIGITE O VALOR DO DESCONTO: ");
		desconto = javaIn.nextDouble();
		
		System.out.println("DIGITE O VALOR DO JUROS: ");
		juros = javaIn.nextDouble();
		
		//Realiza os calculos
		double  valorVista = valorCompra - (valorCompra*(desconto/100)),
				valorJuros = valorCompra + (valorCompra*(juros/100)),
				prestacaoSemJuros = valorCompra / numPrestacoes,
				prestacaoComJuros = valorJuros / numPrestacoes,
				jurosPorPrestacao = prestacaoComJuros - prestacaoSemJuros;
		
		// Imprime valores 
		System.out.println("---------------------------------------");
		System.out.printf("VALOR A VISTA: $%.2f\n", valorVista);
		System.out.printf("VALOR A PRAZO: $%.2f\n", valorJuros);
		System.out.printf("PRESTAÇÃO SEM JUROS: $%.2f\n", prestacaoSemJuros);
		System.out.printf("VALOR PAGO A MAIS POR PRESTAÇÃO: $%.2f\n", jurosPorPrestacao);
		
		
	}
}
