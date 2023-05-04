package Pratica6;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		int somaPares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número inteiro: ");
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				somaPares += numeros[i];
			}
		}

		System.out.print("Vetor: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nSoma dos números pares: " + somaPares);
		sc.close();
	}
}