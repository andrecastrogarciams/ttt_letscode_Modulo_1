package aula04;

import java.util.Scanner;

public class Ex02 {
/*
Escreva um código Java que leia 10 valores double do teclado e
armazene-os em uma matriz de dimensões 2x5.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double matriz[][] = new double[2][5];
    for (int i=0 ; i<2 ; i++){
        for (int j=0 ; j<5 ; j++){
            System.out.print("Digite um número: ");
            matriz[i][j] = scanner.nextDouble();
        }
    }

    for (int i=0 ; i<2 ; i++){
        for (int j=0 ; j<5 ; j++){
            System.out.printf("%f  ", matriz[i][j]);
        }
        System.out.println("");
    }

    scanner.close();
}
}
