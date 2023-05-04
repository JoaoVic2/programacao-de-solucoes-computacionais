package Pratica5;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaIdades = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a idade da pessoa " + i + ": ");
			int idade = sc.nextInt();
			somaIdades += idade;
		}

		double media = (double) somaIdades / 10;
		System.out.println("A média das idades é: " + media);
		sc.close();
	}
}