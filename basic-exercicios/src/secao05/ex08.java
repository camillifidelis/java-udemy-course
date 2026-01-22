package secao05;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valor = sc.nextDouble();
		
		if (valor > 0.0 && valor <= 2000.00) {
			System.out.println("Isento");
		}
		else if (valor > 2000.00 && valor <= 3000.00) {
			valor = (valor - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", valor);
		}
		else if (valor > 3000.00 && valor <= 4500.00) {
			valor = (valor - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", valor);
		}
		else {
			valor = (valor - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", valor);
		}
			
		
		sc.close();
	}

}
