package Pratica9;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o %dº número (ordenado): ", i + 1);
			vetor[i] = sc.nextInt();
		}

		while (true) {
			System.out.print("\nInforme o número a ser pesquisado (ou -1 para sair): ");
			int numero = sc.nextInt();

			if (numero == -1)
				break;

			int comparacoes = 0;

			int posicao = Arrays.binarySearch(vetor, numero);
			if (posicao >= 0) {
				comparacoes = posicao + 1; // posição começa em 0
				System.out.printf("Número encontrado após %d comparações.\n", comparacoes);
			} else {
				System.out.println("Número não encontrado.");
			}
		}
		sc.close();
	}
}