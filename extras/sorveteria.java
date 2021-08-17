import java.util.Scanner;

/*
    1. Pedir nome
    2. Pedir o sabor
    3. Pedir a quantidade de sorvetes
    4. Perguntar se quer para viagem
    5. Mostrar infos do pedido na tela
*/

public class Main {
    public static void main(String[] args) {
        Scanner javaIn = new Scanner(System.in);
        
        String nome, sabor;
        int quantSorvetes;
        boolean isParaViagem;
        
        System.out.println("Digite seu nome: ");
        nome = javaIn.nextLine();
        
        System.out.println("Digite o sabor desejado: ");
        sabor = javaIn.nextLine();
        
        System.out.println("Digite quantos sorvetes você quer: ");
        quantSorvetes = javaIn.nextInt();
        
        System.out.println("Quer para viagem ?");
        isParaViagem = javaIn.nextBoolean();
        
        System.out.println("Nome: " + nome);
        System.out.println("Sabor: " + sabor);
        System.out.println("Quantidade: " + quantSorvetes);
        System.out.println("Para viagem ? " + isParaViagem);
        
        
    }
    
}
