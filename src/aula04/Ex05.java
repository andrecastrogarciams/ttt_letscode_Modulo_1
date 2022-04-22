package aula04;

import java.util.Scanner;

public class Ex05 {
/*
Crie um método que recebe uma matriz bidimensional inteira e um
inteiro que indica uma de suas linhas, e retorna a média dos valores
daquela linha
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

    for (int i=0 ; i<linha ; i++){
        for (int j=0 ; j<coluna ; j++){
            System.out.printf("%d  ", matriz[i][j]);
        }
        System.out.printf("\n");
    }

    System.out.printf("\n\nInforme a linha para encontrar a média: ");
    int linhaMedia = scanner.nextInt() - 1;

    double media = mediaLinhaMatriz(matriz,linhaMedia);
    System.out.printf("\nA média da linha informada = %.2f\n", media );

    scanner.close();
}
    public static double mediaLinhaMatriz (int[][] matriz, int linha){
        double soma = 0.0;

        for (int valor : matriz[linha]){
            soma += valor;
        }

        double media = soma / matriz[linha].length;
        return media;
    }
}
