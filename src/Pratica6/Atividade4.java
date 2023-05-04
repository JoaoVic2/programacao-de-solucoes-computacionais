package Pratica6;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] numeros = new double[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número real: ");
			numeros[i] = sc.nextDouble();
		}

		System.out.print("Elementos nas posições pares: ");
		for (int i = 0; i < numeros.length; i += 2) {
			System.out.print(numeros[i] + " ");
		}
		sc.close();
	}
}