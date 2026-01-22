package secao04;

import java.util.Scanner;
import java.util.Locale;

public class ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		double soma = x + y;
		
		System.out.printf("SOMA = %.0f%n", soma);
		
		sc.close();
	}

}
