package application;

import java.util.Scanner;

import entities.ex09;

public class Program_ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		ex09 vect[] = new ex09[n];
		int velha = 0;
		String nome = "nome";
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i);
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			
			vect[i] = new ex09(name, age);
			
			if (vect[i].getAge() > velha) {
				velha = vect[i].getAge();
				nome = vect[i].getName();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nome);
		
		sc.close();

	}

}
