package Pratica5;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = sc.nextInt();

		int menor = num1 < num2 ? num1 : num2;
		int maior = num1 > num2 ? num1 : num2;

		for (int i = menor; i <= maior; i++) {
			System.out.print(i + " ");
		}

		sc.close();
	}
}
