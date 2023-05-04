package Pratica5;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		int num;
		int fat = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("Número inválido! Digite um número positivo.");
		} else {
			for (int i = num; i >= 1; i--) {
				fat *= i;
			}
			System.out.println(num + "! = " + fat);
		}
		sc.close();
	}
}