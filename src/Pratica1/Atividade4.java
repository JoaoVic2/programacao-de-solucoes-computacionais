package Pratica1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu atual salário: ");
		double salario = sc.nextDouble();
		
		double acrescimo = (salario * 25) / 100;
		
		System.out.println("Seu novo salário com um acrescimo de 25% é: " + (salario + acrescimo));
	
		sc.close();
	}

}
