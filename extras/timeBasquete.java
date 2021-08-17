
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String nome;
        int idade;
        double peso;
        double altura;
        char tamanhoUniforme;
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        
        System.out.print ("Informe a sua idade: ");
        idade = scanner.nextInt();
        
        System.out.print ("Informe o seu peso: ");
        peso = scanner.nextDouble();
        
        System.out.print ("Informe a sua altura: ");
        altura = scanner.nextDouble();
        
        System.out.print ("Informe o tamannho do uniforme: ");
        tamanhoUniforme = scanner.next().charAt(0);
        
        
        System.out.println ("nome " + nome);
        System.out.println ("idade " + idade);
        System.out.println ("peso " + peso);
        System.out.println ("altura " + altura);
        System.out.println ("tamanho do uniforme " + tamanhoUniforme);
        
    }
}
