package aula04;

import java.util.Scanner;

public class Ex07 {
/*
Escreva um código que leia um vetor G de 10 elementos do tipo caracter
que representa o gabarito de uma prova. A seguir, para cada um dos 10
alunos da turma, leia o vetor de respostas (R) do aluno e conte o
número de acertos. Mostre o número de acertos do aluno e uma
mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma
mensagem de REPROVADO, caso contrário.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] gabarito = new char[10];
    char[][] respostas =  new char[10][gabarito.length];
    String[] alunos = new String[respostas.length];
    int[] acertos = new int[respostas.length];

    for (int i=0 ; i<gabarito.length ; i++){
        System.out.printf("Gabarito Questão #%d: ", (i+1));
        gabarito[i] = Character.toUpperCase(scanner.nextLine().charAt(0));
    }

    for (int i=0 ; i<respostas.length ; i++){
        System.out.printf("\nInforme o Nome do Aluno: ");
        alunos[i] = scanner.nextLine();
        for (int j=0 ; j<respostas.length ; j++){
            System.out.printf("Aluno %s - Questão #%d: ", alunos[i] , (j+1) );
            respostas[i][j] = Character.toUpperCase(scanner.nextLine().charAt(0));
        }
    }


    for (int i=0 ; i<respostas.length ; i++){
        for (int j=0 ; j<respostas[i].length ; j++){
            if (respostas[i][j] == gabarito[j]){
                acertos[i]++;
            }
        }
        if (acertos[i] >= 6){
            System.out.printf("\n\nAluno %s \nAcertos: %d \nAPROVADO", alunos[i] , acertos[i]);
        } else {
            System.out.printf("\n\nAluno %s \nAcertos: %d \nREPROVADO", alunos[i] , acertos[i]);
        }
    }





    scanner.close();
}
}
