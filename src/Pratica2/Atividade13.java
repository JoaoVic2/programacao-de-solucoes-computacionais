package Pratica2;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de diárias: ");
		int dias = sc.nextInt();

		System.out.println("Selecione o tipo de apartamento: \n" + "1 - Simples.\n" + "2 - Duplo.");
		int tipo = sc.nextInt();

		switch (tipo) {
		case 1:
			if (dias < 10) {
				System.out.println("O valor total a ser pago é " + (dias * 100));
			} else if (dias >= 10 && dias <= 15) {
				System.out.println("O valor total a ser pago é " + (dias * 90));
			} else {
				System.out.println("O valor total a ser pago é " + (dias * 80));
			}
			break;
		case 2:
			if (dias < 10) {
				System.out.println("O valor total a ser pago é " + (dias * 140));
			} else if (dias >= 10 && dias <= 15) {
				System.out.println("O valor total a ser pago é " + (dias * 120));
			} else {
				System.out.println("O valor total a ser pago é " + (dias * 100));
			}
			break;
		}
		sc.close();
	}

}
