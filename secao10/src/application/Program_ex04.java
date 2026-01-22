package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int count = 0;
		
		int vect[] = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				count = count + 1;
			}
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
			for(int i=0; i<vect.length; i++) {
				if (vect[i] % 2 == 0) {
					System.out.printf("%d ", vect[i]);
				}
			}
		
			System.out.printf("%n%n");
			System.out.println("QUANTIDADE DE PARES = " + count);
		
		sc.close();

	}

}
