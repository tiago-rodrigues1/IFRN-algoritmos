
public class exercicio07 {

	public static void main(String[] args) {
		
		boolean isPrimo = false;

		for (int i = 1; i <= 100; i++) {
		    
		    System.out.println("O número " + i  + " é:");
		    
		    //Par = i%2==0;
		    
			if(i%2 == 0) {
			    System.out.println("> Par");
			} else {
			    System.out.println("> Ímpar");
			}
			
			//Multiplo de 3 = i%3==0;
			
			if(i%3 == 0) {
			    System.out.println("> Múltiplo de 3");
			}
			
			//Multiplo de 4 = i%4==0;
			
			if(i%4 == 0) {
			    System.out.println("> Múltiplo de 4");
			}
			
			//Multiplo de 5 = i%5==0;
			
			if(i%5 == 0) {
			    System.out.println("> Múltiplo de 5");
			    System.out.println("> Múltiplos de 5 anteriores: ");
			    
			    for(int j = i-5; j > 0; j--) {
			        //Multiplos de 5 anteriores = j%5==0;
			        System.out.print(( j%5==0 ? j + " " : "" ));
			    }
			}
			
			//Verica se é primo
			
			int contador = 0;
		
			
			if(i == 2) {
                isPrimo = true;
                
            } else {
                if(i%2 == 0) {
                    isPrimo = false;
                    
                } else {
                    for (int j = 1; j <= i; j++) {
                        if (i%j == 0) {
                            contador += 1;
                        }
                    }
                    
                    isPrimo = contador==2;
                }
                
            }
			
			if(isPrimo) {
			    System.out.println("> Primo");
			}

			
			System.out.println("\n-----------------------------------------------");
		}

	}

}
