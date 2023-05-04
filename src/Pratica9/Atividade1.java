package Pratica9;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o %dº número: ", i + 1);
			vetor[i] = sc.nextInt();
		}

		while (true) {
			System.out.print("\nInforme o número a ser pesquisado (ou -1 para sair): ");
			int numero = sc.nextInt();

			if (numero == -1)
				break;

			System.out.print("Informe o tipo de busca (S para Sequencial ou SS para Sequencial com Sentinela): ");
			String tipoBusca = sc.next();

			int comparacoes = 0;
			boolean encontrado = false;

			if (tipoBusca.equals("S")) {
				for (int i = 0; i < 10; i++) {
					comparacoes++;
					if (vetor[i] == numero) {
						encontrado = true;
						break;
					}
				}
			} else if (tipoBusca.equals("SS")) {
				vetor[10] = numero;
				int i = 0;
				while (vetor[i] != numero) {
					comparacoes++;
					i++;
				}
				encontrado = (i < 10);
			} else {
				System.out.println("Tipo de busca inválido!");
			}

			if (encontrado) {
				System.out.printf("Número encontrado após %d comparações.\n", comparacoes);
			} else {
				System.out.println("Número não encontrado.");
			}
		}
		sc.close();
	}
}
