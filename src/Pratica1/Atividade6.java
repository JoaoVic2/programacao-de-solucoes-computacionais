package Pratica1;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura digitada convertida em fahrenheit é: " + fahrenheit);
		sc.close();
	}

}
