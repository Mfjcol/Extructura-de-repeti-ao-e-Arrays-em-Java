import java.util.Scanner;

public class exercio1 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String nome;
			int idade;

			while (true) {

				System.out.println("Nome: ");
				nome = scan.next();

				// equals e pra dados nao primitivos e direcionados a objetos
				// no caso da ser dados primitivos seria ==.

				if (nome.equals("0"))
					break;

				System.out.println("Idade: ");
				idade = scan.nextInt();
				// exemplo de == com dado promitivos.
				if (idade < 18)
					break;
			}
		}

	}
}
