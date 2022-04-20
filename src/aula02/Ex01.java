package aula02;

import java.util.Scanner;

public class Ex01 {
/*
Escreva um programa que seja capaz de receber as seguintes
informações e calcular a média da nota de um aluno:
■ Nome
■ Turma
■ Nota 1
■ Nota 2
■ Nota 3
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nome do aluno:");
    String nomeAluno = scanner.nextLine();

    System.out.println("Turma: ");
    String turmaAluno = scanner.nextLine();

    double[] notasAluno = new double[3];
    for (int i = 0 ; i < notasAluno.length ; i++){
        System.out.printf("\nNota %d: ", i + 1);
        notasAluno[i] = scanner.nextDouble();
    }

    double mediaAluno = 0;
    for (int i = 0 ; i < notasAluno.length ; i++){
        mediaAluno += notasAluno[i];
    }

    mediaAluno = mediaAluno / notasAluno.length;

    System.out.printf("\nA média do aluno %s da turma %s é: %.2f", nomeAluno , turmaAluno , mediaAluno);

    scanner.close();
}
}
