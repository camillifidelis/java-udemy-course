package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex11;

public class Program_ex11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double maior = 0.0;
		double menor = 999;
		double sum = 0;
		double media;
		int count = 0;
		int countM = 0;
		
		ex11 vect[] = new ex11[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i);
			char genero = sc.next().charAt(0);
			
			vect[i] = new ex11(altura, genero);
			
			if (maior < vect[i].getAltura()) {
				maior = vect[i].getAltura();			
				}
			
			if (menor > vect[i].getAltura()) {
				menor = vect[i].getAltura();
			}
			
			if (vect[i].getGenero() == 'F') {
				sum = sum + vect[i].getAltura();
				count++;
			}
			
			if (vect[i].getGenero() == 'M') {
				countM++;
			}
		}
		
		media = sum / count;
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + countM);
		
		sc.close();

	}

}
