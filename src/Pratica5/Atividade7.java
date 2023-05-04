package Pratica5;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = sc.nextInt();

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}

		System.out.println("Maior número: " + max);
		System.out.println("Menor número: " + min);

		sc.close();
	}
}