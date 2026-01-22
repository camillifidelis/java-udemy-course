package secao05;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt();
		
		double total;
		
		if (codigo == 1) {
			total = qtde * 4.00;
		}
		else if (codigo == 2) {
			total = qtde * 4.50;
		}
		else if (codigo == 3 ) {
			total = qtde * 5.00;
		}
		else if (codigo == 4) {
			total = qtde * 2.00;
		}
		else {
			total = qtde * 1.50;
		}
		
		System.out.printf("Total: R$%.2f%n", total);
		
		sc.close();
	}

}
