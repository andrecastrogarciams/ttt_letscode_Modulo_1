package aula01;

import java.util.Scanner;

public class Ex06 {
/*
Crie um algoritmo que realize a conversão do valor em real para as seguintes moedas:
    Dólar
    Euro
    Libra
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double dolarReal = 4.70;
    double euroReal = 5.11;
    double libraReal = 6.12;

    System.out.println("Informe o valor em Reais: ");
    double valorReal = scanner.nextDouble();

    System.out.printf("%nDólar: %.2f", valorReal * dolarReal);
    System.out.printf("%nEuro: %.2f", valorReal * euroReal);
    System.out.printf("%nLibra: %.2f", valorReal * libraReal);


    scanner.close();
}
}
