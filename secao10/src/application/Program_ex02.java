package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double vect[] = new double[n];
		double sum = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i]= sc.nextDouble();
			sum += vect[i];
		}
		
		double media = 0;
		media = sum / n;
		
		System.out.print("VALORES: ");
		
			for (int i=0; i<vect.length; i++) {
				System.out.printf("%.1f ", vect[i]);
			}
			
		System.out.println();
		System.out.printf("SOMA: %.2f%n", sum);
		System.out.printf("MEDIA: %.2f%n", media);
		
		sc.close();
		
	}

}
