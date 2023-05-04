package Pratica2;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();

		System.out.println("Digite o número correspondente ao seu sexo:\n" + "1 - Masculino.\r\n" + "2 - Feminino.");
		int sexo = sc.nextInt();
		switch (sexo) {
		case 1:
			if (idade <= 15) {
				System.out.println("O valor da mensalidade a ser paga é: R$60,00");
			} else if (idade >= 16 && idade <= 18) {
				System.out.println("O valor da mensalidade a ser paga é: R$75,00");
			} else if (idade >= 19 && idade <= 30) {
				System.out.println("O valor da mensalidade a ser paga é: R$90,00");
			} else if (idade >= 31 && idade <= 40) {
				System.out.println("O valor da mensalidade a ser paga é: R$85,00");
			} else {
				System.out.println("O valor da mensalidade a ser paga é: R$80,00");
			}
			break;
		case 2:
			if (idade <= 18) {
				System.out.println("O valor da mensalidade a ser paga é: R$60,00");
			} else if (idade >= 19 && idade <= 25) {
				System.out.println("O valor da mensalidade a ser paga é: R$90,00");
			} else if (idade >= 26 && idade <= 40) {
				System.out.println("O valor da mensalidade a ser paga é: R$85,00");
			} else {
				System.out.println("O valor da mensalidade a ser paga é: R$80,00");
			}
			break;
		}
		sc.close();
	}

}
