import java.util.Scanner;

public class exercio3 {
	
	public static void main ( String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int numero = 0;
			int count = 0;
			int maior = 0;
			int soma = 0;
			
			do {
				System.out.println("Numero :");
				numero = scan.nextInt();
				soma +=numero;
				
				if (numero > maior) {
					maior =numero;
				}
			
				
				count++;
				
				
			}while (count < 5);
			
			System.out.println(" O maior e :" + maior );
			System.out.println(" A media e :" + soma/5);
		}
		
	}
}
