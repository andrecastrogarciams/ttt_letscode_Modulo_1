package aula03;

import java.util.Scanner;

public class Ex09 {
/*
Escreva um programa que exiba quantas pessoas possuem mais de 18
anos. O algoritmo deverá ler a idade de 10 pessoas.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] idades = new int[10];

    for (int i = 0 ; i < 10 ; i++){
        System.out.print("Informe a idade: ");
        idades[i] = scanner.nextInt();
    }

    int maiorDezoito = 0;
    for (int idade : idades){
        maiorDezoito += (idade > 18 ? 1 : 0);
    }

    System.out.printf("%d pessoa(s) maior(es) de 18 anos", maiorDezoito);

    scanner.close();
}
}
