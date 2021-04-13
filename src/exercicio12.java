
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		String mensagem;
		int cifra;
		
		System.out.println("[1] Criptografar");
		System.out.println("[2] Descriptografar");
		
		System.out.print("Escolha uma opação [1/2]: ");
		int op = javaIn.nextInt();
		
		javaIn.nextLine(); // Para não dar problema nas nos próximos nextLine()
		
		switch (op) {
			case 1 :
				System.out.println("Mensagem a ser criptografada: ");
				mensagem = javaIn.nextLine();
				
				System.out.println();
				
				System.out.print("Valor da cifra: ");
				cifra = javaIn.nextInt();
				
				System.out.println(criptografar(mensagem, cifra));
				
				break;
			case 2:
				System.out.println("Mensagem a ser descriptografada: ");
				mensagem = javaIn.nextLine();
				
				System.out.println();
				
				System.out.print("Valor da cifra: ");
				cifra = javaIn.nextInt();
				
				System.out.println(descriptografar(mensagem, cifra));
				
				break;

			default :
				System.out.print("Operação inválida");
				
				break;
		}

	}
	
	public static String criptografar(String msg, int pos) {
		msg = msg.replaceAll(" ", "_");
		
		String msgCriptografada = "";
		
		for(int i = 0; i < msg.length(); i++) {
			
			int letra = (int) msg.charAt(i);
			letra += pos;
			
			char letraCriptografada = (char) letra;
			
			msgCriptografada += letraCriptografada;
		}
		
		return msgCriptografada;
	}
	
	public static String descriptografar(String msg, int pos) {
		String msgDescriptografada = "";
		
		for(int i = 0; i < msg.length(); i++) {
			
			int letra = (int) msg.charAt(i);
			letra -= pos;
			
			char letraDescriptografada = (char) letra;
			
			msgDescriptografada += letraDescriptografada;
		}
		
		return msgDescriptografada;
	}

}
