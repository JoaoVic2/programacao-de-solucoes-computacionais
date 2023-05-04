package Pratica3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int canal, pessoasAssistindo, totalPessoasAssistindo = 0;
		int[] audienciaCanais = new int[5];

		do {
			System.out.print("Informe o número do canal (2, 4, 5, 7, 12): ");
			canal = sc.nextInt();

			if (canal != 0) {
				System.out.print("Informe o número de pessoas assistindo o canal: ");
				pessoasAssistindo = sc.nextInt();
				audienciaCanais[canal - 2] += pessoasAssistindo;

				totalPessoasAssistindo += pessoasAssistindo;
			}
		} while (canal != 0);

		for (int i = 0; i < audienciaCanais.length; i++) {
			double percentualAudiencia = ((double) audienciaCanais[i] / totalPessoasAssistindo) * 100;
			System.out.printf("Canal %d: %.2f%%\n", i + 2, percentualAudiencia);
		}
		sc.close();
	}
}