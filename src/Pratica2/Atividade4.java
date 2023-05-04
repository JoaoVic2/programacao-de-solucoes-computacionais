package Pratica2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu peso em KG: ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite sua altura em metros: ");
		double altura = sc.nextDouble();
		
		double imc = (peso /(altura * 2 ));
		System.out.println("Seu IMC é: " + imc);
		
		if (imc < 20) {
			System.out.println("Você está abaixo do peso!");
		}else if (imc >= 20 && imc < 25) {
			System.out.println("Você está no peso normal!");
		}else if (imc >= 25 && imc < 30) {
			System.out.println("Você está com sobrepeso!");
		}else if (imc >= 30 && imc < 40) {
			System.out.println("Você está com obesidade!");
		}else {
				System.out.println("Você está com obesidade mórbida");
			}
		sc.close();
	}

}
