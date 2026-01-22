package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double sum = 0;
		
		double vect[] = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			sum = sum + vect[i];
			
		}
		
		double media = sum / n;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR: %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			for(int i=0; i<vect.length; i++) {
				if (vect[i] < media) {
					System.out.println(vect[i]);
				}
			}
			
		sc.close();

	}

}
