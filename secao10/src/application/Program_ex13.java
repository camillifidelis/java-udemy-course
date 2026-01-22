package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ex13;

public class Program_ex13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// foi criada uma lista da classe ex100 onde os dados de lá vão ser completados pela leitura daqui
		List<ex13> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			
			// primeiro foi criado, ai são completos o Id na lista e se já tiver vai mostrar msg e falar p colocar outro
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			// nome incluso no cadastro
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			// salario incluso no cadastro
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			// todos os dados lidos são alocados na classe ex100
			list.add(new ex13(id, name, salary));
		}

		// PART 2 -atualizando salario
		
		System.out.println();
		// escolhe qual o id q vai ter o salario alterado
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		// vai buscar na lista o id escolhido e se n tiver vai retornar nulo
		ex13 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			// se o id existir e for achado, entra a porcentagem q sera incrementada
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			// é incrementado ao salario pelo esquema do ex100
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - p listar os cadastros
		
		System.out.println();
		System.out.println("List of employees:");
		for (ex13 obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<ex13> list, int id) {
		ex13 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}