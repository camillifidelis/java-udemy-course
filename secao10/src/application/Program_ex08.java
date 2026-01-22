package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		
		int vect[] = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				sum = sum + vect[i];
				count = count + 1;
			}
			
		}
	
		if (sum == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double media = sum / count;
			System.out.printf("MEDIA DOS PARES: %.1f%n", media);
		}
		
		sc.close();
		
	}

}
