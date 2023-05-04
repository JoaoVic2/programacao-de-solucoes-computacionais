package Pratica5;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade;
		int soma = 0;
		int total = 0;
		double media;

		System.out.println("Digite as idades (digite um número negativo para encerrar):");

		idade = sc.nextInt();
		while (idade >= 0) {
			soma += idade;
			total++;
			idade = sc.nextInt();
		}

		if (total == 0) {
			System.out.println("Nenhuma idade foi digitada!");
		} else {
			media = (double) soma / total;
			System.out.printf("A média das idades é %.2f\n", media);
		}
		sc.close();
	}
}