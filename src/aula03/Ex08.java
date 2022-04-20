package aula03;

import java.util.Scanner;

public class Ex08 {
/*
Escreva um programa que leia 10 valores inteiros e positivos e encontre o
maior valor, o menor valor e calcule a média dos números lidos e exiba
essas informações.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[10];

    for (int i = 0 ; i < 10 ; i++){
        System.out.print("Informe um número inteiro positivo: ");
        numeros[i] = scanner.nextInt();
    }

    double media = 0;
    int menor = numeros[0];
    int maior = 0;

    for (int numero : numeros){
        menor = (numero < menor ? numero : menor);
        maior = (numero > maior ? numero : maior);
        media += numero;
    }
    media = media / numeros.length;

    System.out.printf("Menor: %d\n", menor);
    System.out.printf("Maior: %d\n", maior);
    System.out.printf("Media: %.2f", media);
    scanner.close();
}
}
