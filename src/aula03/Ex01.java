package aula03;

import java.util.Scanner;

public class Ex01 {
/*
Escreva um programa que leia quatro notas escolares de um aluno e
apresenta uma mensagem informando se o aluno foi aprovado caso
apresente o valor da média escolar maior ou igual a 7. Caso contrário,
apresente uma mensagem informando que ele está de recuperação.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] notas = new double[4];

    for (int i = 0 ; i < notas.length ; i++){
        System.out.printf("Nota #%d: ", i + 1);
        notas[i] = scanner.nextDouble();
    }

    double media = 0;
    for (double nota : notas){
        media += nota;
    }

    media = media / notas.length;
    System.out.printf("\nMédia: %.2f\n", media);
    if (media >= 7.0){
        System.out.println("Aluno Aprovado!");
    } else {
        System.out.println("Aluno de Recuperação!");
    }

    scanner.close();
}
}
