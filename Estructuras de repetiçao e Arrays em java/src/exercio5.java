import java.util.Scanner;

public class exercio5 {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int tabuada = 0;

			System.out.println("TABUADA : ");
			tabuada = scan.nextInt();

			System.out.println("Tabuada de " + tabuada);

			for (int i = 1; i <= 10; i++) {
				System.out.println(tabuada + " X " + i + "= " + (tabuada * i));
			}
		}
	}

}
