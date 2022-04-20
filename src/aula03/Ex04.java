package aula03;

import java.util.Scanner;

public class Ex04 {
/*
Escreva um programa que receba 5 números inteiros, armazene-os em um
array, e imprima na tela os valores em ordem decrescente.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[5];
    for (int i = 0 ; i < numeros.length ; i++){
        System.out.print("Digite um número inteiro: ");
        numeros[i] = scanner.nextInt();
    }

    for (int i = 0 ; i < numeros.length ; i++){
        for (int j = i+1 ; j < numeros.length ; j++){
            if (numeros[j] < numeros[i]){
                int menor = numeros[j];
                numeros[j] = numeros[i];
                numeros[i] = menor;
            }
        }
    }

    for (int numero : numeros){
        System.out.printf("%d  ", numero);
    }

    scanner.close();
}
}
