import java.util.Scanner;

public class exercicio02 {
	public static void  main (String [] args) {
		Scanner javaIn = new Scanner (System.in);
		
		double raio;
		final double pi = 3.14;
		
		System.out.print("Digite o valor do raio: ");
		raio = javaIn.nextDouble();
		
		double diametro, perimetro, area;
		
		diametro = raio * 2;
		perimetro = diametro * pi;
		area = pi * (raio*raio);
		
		System.out.println("Para raio = " + raio + " ->\n");
		System.out.printf("Diametro = %.2f\n", diametro);
		System.out.printf("Perimetro = %.2f\n", perimetro);
		System.out.printf("Area = %.2f\n", area);
		
		
	}
}
