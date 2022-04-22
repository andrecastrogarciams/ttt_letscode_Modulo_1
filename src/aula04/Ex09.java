package aula04;

import java.util.Scanner;

public class Ex09 {
/*
Crie um programa que preencha uma matriz de 3x5 com números
inteiros. Em seguida faça:
    a. some cada uma das linhas armazenando o resultado em um vetor;
    b. some cada uma das colunas armazenando o resultado em um vetor;
    c. imprima o resultado da soma das linhas;
    d. imprima o resultado da soma das coluna;
    e. imprima a matriz completa
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[3][5];

    for (int i=0 ; i<matriz.length ; i++ ){
        for (int j=0 ; j<matriz[i].length ; j++){
            System.out.printf("Digite um numero inteiro: ");
            matriz[i][j] = scanner.nextInt();
        }
    }

    int[] somaLinhas = new int[matriz.length];
    int[] somaColunas = new int[matriz[0].length];

    for (int i=0 ; i<matriz.length ; i++ ){
        for (int j=0 ; j<matriz[i].length ; j++){
            somaLinhas[i] += matriz[i][j];
        }
    }

    for (int i=0 ; i<matriz[0].length ; i++ ){
        for (int j=0 ; j<matriz.length ; j++){
            somaColunas[i] += matriz[j][i];
        }
    }
    System.out.println("");
    for (int i=0 ; i<matriz.length ; i++){
        System.out.printf("Soma da linha #%d = %d\n", (i+1) , somaLinhas[i]);
    }
    System.out.println("");
    for (int i=0 ; i<matriz[0].length ; i++){
        System.out.printf("Soma da coluna #%d = %d\n", (i+1) , somaColunas[i]);
    }
    System.out.println("");
    for (int i=0 ; i<matriz.length ; i++ ){
        for (int j=0 ; j<matriz[i].length ; j++){
            System.out.printf("%d  ", matriz[i][j]);
        }
        System.out.printf("\n");
    }
    scanner.close();
}
}
