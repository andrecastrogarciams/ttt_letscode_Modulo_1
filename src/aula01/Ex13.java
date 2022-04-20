package aula01;

import java.util.Scanner;

public class Ex13 {
/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos.
Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%. Escreva um programa que leia o custo
de fábrica e informe o custo ao consumidor final.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o custo de fábrica do veículo: ");
    double custoFabrica = scanner.nextDouble();

    double custoDistribuidor = 0.28;
    double custoImpostos = 0.45;

    double valorFinal = custoFabrica + (custoFabrica * (custoImpostos + custoDistribuidor));

    System.out.printf("%nO valor final ao consumidor = $ %.2f", valorFinal);

    scanner.close();
}
}
