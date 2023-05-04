package Pratica5;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.print("Digite um número inteiro (ou -1 para sair): ");
		num = sc.nextInt();

		while (num != -1) {
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
			System.out.print("Digite outro número inteiro (ou -1 para sair): ");
			num = sc.nextInt();
		}

		if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
			System.out.println("Nenhum número foi informado.");
		} else {
			System.out.println("Maior número informado: " + maior);
			System.out.println("Menor número informado: " + menor);
		}
		sc.close();
	}
}