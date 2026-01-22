package secao04;
import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int funcionario = sc.nextInt();
		double horas = sc.nextDouble();
		double valor = sc.nextDouble();
		double salario = horas * valor;
		
		System.out.printf("NUMBER: %d%n", funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
