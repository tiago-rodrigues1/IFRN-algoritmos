
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner javaIn = new Scanner(System.in);
		
		String meuNome = "tiago", nomePessoa, animeFavorito, personagemFavorito;
		int idade, contador = 0;
		double peso,altura;
		char gostaAnime;
		
		//Verifica nome
		System.out.print("Digite seu nome: ");
		nomePessoa = javaIn.nextLine();
		
		boolean isNomeIgual = nomePessoa.toLowerCase().equals(meuNome);
		
		if(isNomeIgual) {
			System.out.println("Você tem o nome igual ao meu\n");
			++contador;
		} else {
			System.out.println("Você tem o nome diferente do meu\n");
		}
		
		//Verifica idade
		System.out.print("Digite sua idade: ");
		idade = javaIn.nextInt();
		
		// Minha idade = 16 anos
		boolean isIdadeIgual = idade == 16;
		
		if(isIdadeIgual) {
			System.out.println("Sua idade é igual a minha\n");
			++contador;
		} else {
			System.out.println("Sua idade é diferente da minha\n");
		}
		
		//Verifica peso
		System.out.print("Digite o seu peso: ");
		peso = javaIn.nextDouble();
		
		//Meu peso = 62kg
		boolean isPesoIgual = peso == 62.0;
				
		if(isPesoIgual) {
			System.out.println("Caramba! Seu peso é igual ao meu");
			++contador;
		} else {
			double diferencaPeso = peso - 62.0;
			
			System.out.println("Meu peso é difente do seu");
			System.out.print("Você pesa " + Math.abs(diferencaPeso) + " kg");
			System.out.println((diferencaPeso > 0 ? " a mais \n": " a menos \n"));
		}
		
		//Verifica altura
		System.out.print("Digite sua altura: ");
		altura = javaIn.nextDouble();
		
		//Minha altura = 1.75m
		boolean isAlturaIgual = altura == 1.75;
		
		if(isAlturaIgual) {
			System.out.println("Sua altura é igual a minha\n");
			++contador;
		} else {
			System.out.println("Minha altura é difente da sua\n");
		}
		
		//Verifica se gosta de animes, qual o anime e personagem favorito
		System.out.print("Você gosta de animes ? [s/n]: ");
		gostaAnime = javaIn.next().charAt(0);
		
		javaIn.nextLine();
		
		if(gostaAnime == 's' || gostaAnime == 'S') {
			contador += 1;
			
			System.out.print("Digite o nome do seu anime favorito: ");
			animeFavorito = javaIn.nextLine();

			//Meu anime fav. = Naruto
			boolean isAnimeFavoritoIgual = animeFavorito.trim().equalsIgnoreCase("naruto");
			
			if(isAnimeFavoritoIgual) {
				++contador;
				
				System.out.print("Qual é o seu personagem favorito de Naruto ? ");
				personagemFavorito = javaIn.next();
				
				//Meu personagem fav. = Killua
				boolean isPersonagemFavoritoIgual = personagemFavorito.toLowerCase().equals("kakashi");
				
				if(isPersonagemFavoritoIgual) {
					System.out.println("Meu personagem favorito também é o Kakashi\n");
					++contador;
				} else {
					System.out.println("Meu personagem favorito é o Killua\n");
				}
			}
			
		} else {
			System.out.println("Que pena. Não sabe o que tá perdendo\n");
		}
		
		if(contador >= 3) {
			System.out.println("Você é parecido comigo");
		} else {
			System.out.println("Você não é parecido comigo");
		}
	}

}
