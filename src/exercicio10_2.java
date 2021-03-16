
import java.util.*;

public class exercicio10_2 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		double 	valorCompra, mediaCompras, lucroLoja; 
		double 	maiorCompra = 0, 
				menorCompra = 0,
				soma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite o valor da compra: ");
			valorCompra = javaIn.nextDouble();
			
			soma += valorCompra;
			
			if(i == 1) {
				maiorCompra = valorCompra;
				menorCompra = valorCompra;
				
			} else {
				
				if(valorCompra > maiorCompra) {
					maiorCompra = valorCompra;
				}
				
				if(valorCompra < menorCompra) {
					menorCompra = valorCompra;
				}
				
			}
			
		}
		
		System.out.println("\nINFORMAÇÕES REGISTRDAS: \n");
		
		mediaCompras = soma / 10;
		System.out.println("> Média das compras: R$" + mediaCompras);
		
		System.out.println("> Maior compra: R$" + maiorCompra);
		
		System.out.println("> Menor compra: R$" + menorCompra);
		
		double diferenca = maiorCompra - menorCompra;
		System.out.println("> Diferença entre a maior compra e a menor: R$" + diferenca);
		
		lucroLoja = soma * 0.3;
		System.out.println("> Lucro da loja: R$" + lucroLoja);
	}

}
