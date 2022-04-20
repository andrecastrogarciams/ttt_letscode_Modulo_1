package aula03;

import java.util.Scanner;

public class Ex11 {
/*
Escreva um programa que receba dois números inteiros e imprima os
números inteiros que estão no intervalo compreendido entre eles.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe um número inteiro: ");
    int num1 = scanner.nextInt();

    System.out.print("Informe outro número inteiro: ");
    int num2 = scanner.nextInt();

    if (num1 > num2){
        for (int i = num2 + 1 ; i < num1 ; i++){
            System.out.printf("%d \n", i);
        }
    } else {
        for (int i = num1 + 1 ; i < num2 ; i++){
            System.out.printf("%d \n",  i);
        }
    }

    scanner.close();
}
}
