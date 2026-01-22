package secao06;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			
			if (b != 0) {
			double divisao = a/b;
			System.out.println(divisao);
			}
			else {
				System.out.println("divisao impossivel");
			}
			
		}
		
		sc.close();

	}

}
