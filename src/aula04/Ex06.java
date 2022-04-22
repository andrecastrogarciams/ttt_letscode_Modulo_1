package aula04;

import java.util.Scanner;

public class Ex06 {
/*
Escreva um programa que leia um vetor de 13 elementos inteiros, que é
o Gabarito de um teste da loteria esportiva, contendo os valores
1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador,
o número do seu cartão e um vetor de Respostas de 13 posições.
Verifique para cada apostador o números de acertos, comparando o
vetor de Gabarito com o vetor de Respostas. Escreva o número do
apostador e o número de acertos. Se o apostador tiver 13 acertos,
mostrar a mensagem "Ganhador".
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] gabarito = new int[13];

    for (int i=0 ; i<gabarito.length ; i++){
        System.out.printf("Gabarito Jogo #%d: ", (i+1));
        gabarito[i] = scanner.nextInt();
    }

    System.out.printf("\nInforme a quantidade de apostadores: ");
    int apostadores = scanner.nextInt();

    int[][] jogosApostadores = new int[apostadores][gabarito.length];
    int[][] cartaoApostadores = new int[apostadores][2];

    for (int i=0 ; i<jogosApostadores.length ; i++){
        System.out.printf("\nInforme o numero do cartão: ");
        cartaoApostadores[i][0] = scanner.nextInt();

        for (int j=0 ; j<jogosApostadores[i].length ; j++){
            System.out.printf("Cartão: %d - Jogo #%d: ", cartaoApostadores[i][0] , (j+1) );
            jogosApostadores[i][j] = scanner.nextInt();
        }
    }


    for (int i=0 ; i<jogosApostadores.length ; i++){
        for (int j = 0; j< jogosApostadores[i].length ; j++){
            if (jogosApostadores[i][j] == gabarito[j]){
                cartaoApostadores[i][1]++;
            }
        }

        if (cartaoApostadores[i][1] == 13){
            System.out.printf("\n*****CARTÃO #%d - GANHADOR *****", cartaoApostadores[1][0]);
        } else {
            System.out.printf("\nCartão #%d -  %d Acertos", cartaoApostadores[i][0] , cartaoApostadores[i][1]);
        }
    }
    scanner.close();
}
}
