import java.util.Scanner;

public class exercio4 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int quantNumeros = 0;
			int count = 0;
			int numeros = 0;
			int quantPar = 0;
			int quantImpar = 0;

			System.out.println("Cantidad de numeros : ");
			quantNumeros = scan.nextInt();

			do {
				System.out.println("Numeros :");
				numeros = scan.nextInt();
				count++;

				if (numeros % 2 == 0) {
					quantPar++;
				} else {
					quantImpar++;
				}

			} while (count < quantNumeros);
			System.out.println("Quantidades de Pares : " + quantPar);
			System.out.println("Quantidade de Impares : " + quantImpar);
		}

	}

}
