package aula01;

import java.util.Scanner;

public class Ex11 {
/*
Uma loja está vendendo seus produtos em 5 prestações sem juros. Faça um programa que insira o valor total de uma compra
e o valor das prestações.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor total da compra: ");
    double valorTotalCompra = scanner.nextDouble();

    System.out.printf("O valor de cada prestação sem juros = $ %.2f", valorTotalCompra / 5);

    scanner.close();
}
}
