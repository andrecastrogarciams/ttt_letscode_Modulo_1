package aula01;

import java.util.Scanner;

public class Ex12 {
/*
Faça um programa que receba o preço de custo do produto e exiba o valor de venda.
O valor de venda receberá um acréscimo de acordo com o percentual informado pelo usuário.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o preço de custo: ");
    double precoCusto = scanner.nextDouble();

    System.out.println("Informe o percentual de acréscimo (%): ");
    double percentualAcrescimo = scanner.nextDouble();

    double precoVenda = precoCusto + (precoCusto * percentualAcrescimo / 100 );

    System.out.printf("%nO Valor de Venda do produto = $ %.2f", precoVenda);

    scanner.close();
}
}
