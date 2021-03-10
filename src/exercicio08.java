
import java.util.*;

public class exercicio08 {
	
	public static void delay(int t) {
		try {
		    Thread.sleep(t);
		    
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	};
	
	public static void ShowMenu() {	
		System.out.println("|---------------------------------------------|");
		System.out.println("|            ACERTE O NÚMERO                  |");
		System.out.println("|---------------------------------------------|");
		System.out.println("|* Acerte o número que está entre 1 e 10.000  |");
		System.out.println("|                                             |");
		System.out.println("|* Você tem 100 pontos e 20 chances           |");
		System.out.println("|* A cada tentativa errada, você perde 5 pts  |");
		System.out.println("|---------------------------------------------|");
		
		delay(3000);
	};
	
	public static void LoadingGame() {
		String loadingBar = "";
		
		delay(2000);
		
		System.out.println("| LOADING GAME...                             |");
		System.out.print("|");
		
		for(int i = 0; i < 9; i++) {
		    delay(500);
		    loadingBar += "-";
		    
		    System.out.print(loadingBar);    
		}
		
		System.out.print("|\n");
		
		delay(1000);
	};
	
	public static void PlayGame(int number) {
		Scanner javaIn = new Scanner(System.in);
		
		int i = 1, pts = 100;
		boolean isWinner = false;
		
		while(i != 20) {
			System.out.println("|* TENTATIVA " + i + " DE 20");
			
			System.out.print("|-> SUA RESPOSTA: ");
			int resp = javaIn.nextInt();
			
			if(resp == number) {
				isWinner = true;
				break;
			} else {
				if (resp < number) {
					System.out.println("|* É UM NÚMERO MAIOR");
				} else {
					System.out.println("|* É UM NÚMERO MENOR");
				}
			}
			
			i++;
			pts -=5;
			System.out.println("|----------------------------------------------");
		}
		
		EndGame(pts, number, isWinner);
	}
	
	public static void EndGame(int pts, int targetNumber, boolean isWinner) {
		System.out.println("|---------------------------------------------|");
		
		if(isWinner) {
			System.out.println("| PARABÉNS! VOCÊ FEZ " + pts + " PTS"     );
		} else {
			System.out.println("| GAME OVER! O VALOR ERA: " + targetNumber);
		}
		
		System.out.println("|---------------------------------------------|");
	}
	

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		Random rdNum = new Random();
		
		int number = 1+rdNum.nextInt(10000);
		
		ShowMenu();

		LoadingGame();
		
		PlayGame(number);
	}

}
