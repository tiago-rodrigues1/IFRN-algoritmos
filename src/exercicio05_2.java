
import java.util.Scanner;

public class exercicio05_2 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		double salarioMin = 1100, salarioGanho;
		boolean isAcimaDoMin;
		
		System.out.print("Salário ganho = ");
		salarioGanho = javaIn.nextDouble();
		
		isAcimaDoMin = salarioGanho > salarioMin;
		
		System.out.println("Ganha mais que um salário mínimo ? " + isAcimaDoMin);
	}

}
