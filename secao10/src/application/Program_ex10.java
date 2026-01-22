package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ex10;

public class Program_ex10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		ex10 vect[] = new ex10[n];
		
		for (int i=0; i<vect.length; i++) {
			
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i);
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			vect[i] = new ex10(name, n1, n2);
		}
		
		System.out.println("Alunos Aprovados: ");
			for (int i=0; i<vect.length; i++) {
				if (vect[i].media(vect[i].getN1(), vect[i].getN2()) >= 6) {
					System.out.println(vect[i].getName());
				}
			}
		
		sc.close();
	}

}
