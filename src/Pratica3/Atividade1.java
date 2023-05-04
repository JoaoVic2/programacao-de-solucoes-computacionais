package Pratica3;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        int aprovados = 0;
        int reprovados = 0;
        int notaMaior90 = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int totalFaltas;
        double notaFinal;
        double somaNotas = 0;
        
        while (true) {
            System.out.print("Digite a nota final (-1 para sair): ");
            notaFinal = sc.nextDouble();
            
            if (notaFinal < 0) {
                break;
            }
            
            System.out.print("Digite o total de faltas: ");
            totalFaltas = sc.nextInt();
            
            somaNotas += notaFinal;
            contador++;
            
            if (notaFinal >= 90) {
                notaMaior90++;
            }
            
            if (notaFinal < 70 || totalFaltas >= 20) {
                reprovados++;
            } else {
                aprovados++;
            }
            
            if (notaFinal > maiorNota) {
                maiorNota = (int) notaFinal;
            }
            
            if (notaFinal < menorNota) {
                menorNota = (int) notaFinal;
            }
        }
        
        if (contador > 0) {
            System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + notaMaior90);
            System.out.println("Quantidade de alunos reprovados por nota ou por faltas: " + reprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + (somaNotas / contador));
        } else {
            System.out.println("Nenhum aluno informado.");
        }
        
        sc.close();
    }
}