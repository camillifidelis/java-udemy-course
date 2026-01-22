package secao04;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt(); 
		int D = sc.nextInt();
		
		double produto1 = A * B;
		double produto2 = C * D;
		double diferenca = produto1 - produto2;
		
		System.out.printf("DIFERENCA = %.0f%n", diferenca);
		
		sc.close();
	}

}
