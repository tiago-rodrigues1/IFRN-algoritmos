
public class exercicio01 {
	public static void main(String[] args) {
		/*
			- int
			- double
			- String
			- boolean 
			- char
		*/
		
		int idade = 16, 
			anoNascimento = 2004,
			serie = 1;
		
		double  peso = 62.45, 
				altura = 1.76;
		
		String  nome = "Tiago", 
				cidade = "Santa Cruz", 
				instituicaoEnsino = "IFRN", 
				curso = "Informatica";
		
		boolean isFormado = false;
		
		char blocoSala = 'B';
		
		System.out.println(nome + " tem " + idade  + " anos");
		System.out.println("Pesa " + peso + "kg e tem " + altura + "m");
		System.out.println("Nasceu em " + anoNascimento + " na cidade de " + cidade);
		System.out.println("Cursa " + curso + " no " + instituicaoEnsino + " está no " + serie + " ano");
		System.out.println("Tem aulas no bloco " + blocoSala);
		System.out.println("Já é formado ? " + isFormado);
	}
}
