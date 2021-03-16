
public class exercicio10_1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i + ": \n");
			
			int m = 1;
			
			while (m <= 10) {
				int produto = m * i;
				
				System.out.println("> " + i + " x " + m + " = " + produto);
				
				m++;
			}
			
			System.out.println("----------------");
		}

	}

}
