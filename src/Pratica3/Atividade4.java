package Pratica3;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nFilhosTotal = 0;
		double salarioTotal = 0.0;
		int nHabitantes = 0;

		System.out.println("Pesquisa da Prefeitura");
		System.out.println("Informe o salário e o número de filhos de cada habitante");
		System.out.println("Digite um salário negativo para encerrar a pesquisa");

		double salario = 0.0;
		while (true) {
			System.out.print("Salário: ");
			salario = sc.nextDouble();
			if (salario < 0) {
				break;
			}
			System.out.print("Número de filhos: ");
			int numFilhos = sc.nextInt();

			salarioTotal += salario;
			nFilhosTotal += numFilhos;
			nHabitantes++;
		}
		sc.close();
		if (nHabitantes == 0) {
			System.out.println("Nenhum habitante foi informado");
			return;
		}

		double mediaSalarial = salarioTotal / nHabitantes;
		double mediaFilhos = (double) nFilhosTotal / nHabitantes;

		System.out.printf("Média salarial: R$%.2f\n", mediaSalarial);
		System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
	}
}