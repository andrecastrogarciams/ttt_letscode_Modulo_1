package aula01;

import java.util.Scanner;

public class Ex09 {
/*
Escreva um programa que leia o nome de um aluno e as notas das 3 primeiras provas que ele obteve no semestre.
No final deverá informar a média do aluno.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o nome do Aluno:");
    String nomeAluno = scanner.nextLine();

    System.out.println("Nota da Prova 1: ");
    double provaUm = scanner.nextDouble();

    System.out.println("Nota da Prova 2: ");
    double provaDois = scanner.nextDouble();

    System.out.println("Nota da Prova 3: ");
    double provaTres = scanner.nextDouble();

    double media = (provaUm + provaDois + provaTres) / 3;
    System.out.printf("A media do aluno %s é: %.2f", nomeAluno, media );

    scanner.close();
}
}
