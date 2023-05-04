package Pratica5;

import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        int contFem = 0;
        char sexo;
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i);
            idade = sc.nextInt();
            
            System.out.printf("Digite o sexo da %dª pessoa (M/F): ", i);
            sexo = sc.next().charAt(0);
            
            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                contFem++;
            }
        }
        
        System.out.printf("%d mulheres com idade entre 20 e 40 anos.\n", contFem);
        sc.close();
    }
}