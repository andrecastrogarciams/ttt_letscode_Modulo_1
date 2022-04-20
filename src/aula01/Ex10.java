package aula01;

import java.util.Scanner;

public class Ex10 {
/*
Crie um programa que receba um valor que foi depositado e logo em seguida o valor com rendimento após 1 mês.
Considere a taxa de juros da poupança em 0,70% a.m.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor depositado: ");
    double valorDepositado = scanner.nextDouble();
    double taxaMensalJuros = 0.07;

    System.out.printf("O rendimento do valor depositado após 1 mês = $ %.2f",  valorDepositado + (valorDepositado * taxaMensalJuros) );


    scanner.close();
}
}
