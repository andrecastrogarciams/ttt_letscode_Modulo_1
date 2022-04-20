package aula01;

import java.util.Scanner;

public class Ex07 {
/*
Crie um programa que receba 2 números e ao final mostre as seguintes operações:
    Soma
    Subtração
    Multiplicação
    Divisão
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    double numeroUm = scanner.nextDouble();

    System.out.println("Informe o segundo número:");
    double numeroDois = scanner.nextDouble();

    System.out.printf("%nSoma = %.2f", numeroUm + numeroDois);
    System.out.printf("%nSubtração = %.2f", numeroUm - numeroDois);
    System.out.printf("%nMultiplicação = %.2f", numeroUm * numeroDois);
    System.out.printf("%nDivisão = %.2f", numeroUm / numeroDois);

    scanner.close();
}
}
