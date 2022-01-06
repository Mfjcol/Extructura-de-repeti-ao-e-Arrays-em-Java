

public class exercio6 {

	public static void main(String[] args) {
		

		int[] vetor = { -3, -4, 45, 5, 6, 7 };

		System.out.println("Vetor");

		for (int i = 0; i < vetor.length; i++) {

			System.out.print(" " + vetor[i]);
		}

		System.out.println("\n\nVetor inverso");
		
		for (int i = (vetor.length - 1); i >= 0; i--) {
			
			System.out.print(" " + vetor[i]);
		}

	}

}
