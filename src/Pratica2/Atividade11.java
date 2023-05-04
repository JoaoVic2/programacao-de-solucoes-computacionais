package Pratica2;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor = 500;

		System.out.println("Digite a quantidade de diárias: ");
		int diaria = sc.nextInt();
		if (diaria < 15) {
			System.out.println("O valor total é: R$" + ((valor * diaria) + (diaria * 15)));
		} else if (diaria == 15) {
			System.out.println("O valor total é: R$" + ((valor * diaria) + (diaria * 10)));
		} else {
			System.out.println("O valor total é: R$" + ((valor * diaria) + (diaria * 5)));
		}
		sc.close();
	}
}
