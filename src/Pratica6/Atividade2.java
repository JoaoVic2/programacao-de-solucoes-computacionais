package Pratica6;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[10];
		String posicoesNegativos = "";

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = sc.nextDouble();
			if (numeros[i] < 0) {
				posicoesNegativos += i + " ";
			}
		}

		System.out.print("Vetor: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nPosições dos números negativos: " + posicoesNegativos);
		sc.close();
	}
}