package aula04;

import java.util.Scanner;

public class Ex04 {
/*
Crie um método que recebe uma matriz de inteiros e retorna a soma de
todos os elementos da matriz.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a quantidade de linhas da Matriz: ");
    int linha = scanner.nextInt();

    System.out.print("Informe a quantidade de colunas da Matriz: ");
    int coluna = scanner.nextInt();

    int matriz[][] = new int[linha][coluna];
    for (int i=0 ; i<linha ; i++){
        for (int j=0 ; j<coluna ; j++){
            System.out.print("Digite um número: ");
            matriz[i][j] = scanner.nextInt();
        }
    }

     int soma = somaMatriz(matriz);
    System.out.printf("\nA soma dos elementos da Matriz = %d\n", soma );

    scanner.close();
}

    public static int somaMatriz (int[][] matriz){
        int soma = 0;

        for (int i=0 ; i<matriz.length ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}
