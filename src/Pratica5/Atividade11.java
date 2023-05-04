package Pratica5;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdMasculinoPeso60a80 = 0;
		int qtdFemininoPeso50a70 = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Pessoa " + i);

			System.out.print("Sexo (M/F): ");
			String sexo = sc.next();

			System.out.print("Peso: ");
			double peso = sc.nextDouble();

			if (sexo.equalsIgnoreCase("M")) {
				if (peso >= 60 && peso <= 80) {
					qtdMasculinoPeso60a80++;
				}
			} else if (sexo.equalsIgnoreCase("F")) {
				if (peso >= 50 && peso <= 70) {
					qtdFemininoPeso50a70++;
				}
			}

			System.out.println();

		}

		System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + qtdMasculinoPeso60a80);
		System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + qtdFemininoPeso50a70);
		sc.close();
	}

}