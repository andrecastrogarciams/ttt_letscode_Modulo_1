package aula04;

import java.util.Scanner;

public class Ex03 {
/*
Crie um método que recebe uma matriz bidimensional double e retorna
o maior valor da matriz.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe a quantidade de linhas da Matriz: ");
    int linha = scanner.nextInt();

    System.out.print("Informe a quantidade de colunas da Matriz: ");
    int coluna = scanner.nextInt();

    double matriz[][] = new double[linha][coluna];
    for (int i=0 ; i<linha ; i++){
        for (int j=0 ; j<coluna ; j++){
            System.out.print("Digite um número: ");
            matriz[i][j] = scanner.nextDouble();
        }
    }

    double maior = maiorValor(matriz);
    System.out.printf("\nO maior número da Matriz: %f\n", maior );

    scanner.close();
}

    public static double maiorValor (double[][] matriz){
        double maior = matriz[0][0];

        for (int i=0 ; i<matriz.length ; i++){
            for (int j=0 ; j<matriz[i].length ; j++){
                maior = (maior < matriz[i][j] ? matriz[i][j] : maior);
            }
        }

        return maior;
    }

}
