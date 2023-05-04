package Pratica1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar: ");
		double real = sc.nextDouble();
		
		System.out.println("Digite o valor que você possui em dolar: ");
		double dolar = sc.nextDouble();	
		
		double convertido = (real * dolar);
		System.out.println("O valor que você possui convertido em reais é: " + (convertido));
		
		sc.close();
	}
}