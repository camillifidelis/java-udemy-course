package application;

import java.util.Locale;
import java.util.Scanner;
import entities.ex03;

public class Program_ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double sum = 0;
		double media = 0;
		double count = 0;
		
		ex03 vect[] = new ex03[n];
		
		for (int i=0; i < vect.length; i++) {
			
			System.out.printf("Dados da %da pessoa %n", i);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new ex03(name, idade, altura);
			
			sum += vect[i].getAltura();
			
			if (vect[i].getIdade() < 16) {
				count = count + 1;
			}
			
		}
	
		count = (count / n) * 100;
		media = sum / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", count);
				for (int i=0; i<vect.length; i++) {
					if (vect[i].getIdade() < 16) {
						System.out.println(vect[i].getName());
					}
				}
		
		sc.close();
		
	}

}
