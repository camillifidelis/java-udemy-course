package secao05;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if ( horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();

	}
}
