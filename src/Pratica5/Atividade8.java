package Pratica5;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int base = sc.nextInt();

		System.out.print("Digite outro número inteiro: ");
		int expoente = sc.nextInt();

		int potencia = 1;
		for (int i = 0; i < expoente; i++) {
			potencia *= base;
		}

		System.out.printf("%d elevado a %d é igual a %d\n", base, expoente, potencia);

		sc.close();
	}
}