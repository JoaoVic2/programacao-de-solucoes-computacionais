package Pratica1;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso em Kg: ");
		double peso = sc.nextDouble();
		
		double engordar = (peso * 15) / 100;
		System.out.println("Se você engordar 15% seu peso será: " + (peso + engordar));
		
		double emagrecer = (peso * 20) / 100 ;
		System.out.println("Se você emagrecer 20% seu peso será: " + (peso - emagrecer));
		sc.close();
	}

}
