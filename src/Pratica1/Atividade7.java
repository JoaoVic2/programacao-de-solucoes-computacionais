package Pratica1;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int salarioMinimo = 1320;
	System.out.println("O valor do salário mínimo em 2023 é: " + salarioMinimo);
	
	System.out.println("Digite seu salário: ");
	double salario = sc.nextDouble();
	
	System.out.println("Seu salário equivale a " + (salario / salarioMinimo));
	sc.close();
	}

}
