package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n; 
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i]=sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d%n", vect[i]);
			}
		}
		
		sc.close();

	}

}
