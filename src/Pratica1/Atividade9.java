package Pratica1;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva o valor do cateto adjascente: ");
		double b = sc.nextDouble();
		
		System.out.println("Escreva o valor do cateto oposto: ");
		double c = sc.nextDouble();
		
		double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
		
		System.out.println("O valor da hipotenusa é: " + a);
		sc.close();
	}

}