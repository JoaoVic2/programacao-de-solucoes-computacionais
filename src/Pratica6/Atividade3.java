package Pratica6;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[10];
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = sc.nextDouble();
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}

		System.out.print("Vetor: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nMenor número: " + menor);
		System.out.println("Maior número: " + maior);
		sc.close();
	}
}