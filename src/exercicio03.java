import java.util.Scanner;

public class exercicio03 {
	public static void main (String [] args) {
		Scanner javaIn = new Scanner (System.in);
		
		double aresta;
		final double raiz = 1.73;
		
		System.out.print("Digite o valor da aresta: ");
		aresta = javaIn.nextDouble();
		
		double areaSuperficie, volume, diagonal;
		
		areaSuperficie = aresta * aresta * 6;
		volume = aresta * aresta * aresta;
		diagonal = aresta * raiz;
		
		System.out.println("Para aresta = " + aresta + " ->\n");
		System.out.printf("Área da superfície = %.2f\n", areaSuperficie);
		System.out.printf("Volume = %.2f\n", volume);
		System.out.printf("Diagonal = %.2f\n", diagonal);
		
	}
}
