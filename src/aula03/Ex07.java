package aula03;

import java.util.Scanner;

public class Ex07 {
/*
Escreva um programa que recebe um número inteiro maior que zero e
calcula o seu valor fatorial.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe um numero inteiro maior que zero: ");
    int numero = scanner.nextInt();
    long fatorial = 1;

    for (int i = numero ; i > 1 ; i--){
        fatorial *=i;
    }
    System.out.printf("\n%d! = %d", numero, fatorial);


    scanner.close();
}
}
