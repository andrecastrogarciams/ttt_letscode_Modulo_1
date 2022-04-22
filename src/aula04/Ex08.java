package aula04;

import java.util.Scanner;

public class Ex08 {
/*
Faça um programa para receber um conjunto de 10 valores até 100, e
insira em uma matriz, em seguida você deverá receber um outro valor e
verificar se o elemento existe no conjunto de 10 valores da matriz. Caso
exista você deve imprimir uma mensagem: "O valor existe no conjunto",
caso contrário deverá exibir: "O valor não existe no conjunto".
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[][] matriz = new int[2][5];
    for (int i=0 ; i<matriz.length ; i++){
        for (int j=0 ; j<matriz[i].length ; j++){
            System.out.printf("Informe um valor até 100: ");
            matriz[i][j] = scanner.nextInt();
        }
    }

    int valor;
    System.out.printf("\n\nInforme um valor para pesquisar na matriz: ");
    valor = scanner.nextInt();
    boolean encontrou = false;
    for (int i=0 ; i<matriz.length ; i++){
        for (int j=0 ; j<matriz[i].length ; j++){
            if (matriz[i][j] == valor){
                System.out.println("O valor existe no conjunto");
                encontrou = true;
            }
        }
    }
    if (encontrou == false){
        System.out.println("O valode não existe no conjunto");
    }

    scanner.close();
}
}
