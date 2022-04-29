package aula05;

import java.util.Scanner;

public class Ex02 {
/*
Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do imposto de Renda, que depende do
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o
FGTS corresponde a 11% do salário bruto, mas não é descontado (é a
empresa que deposita.)

O salário líquido corresponde ao salário bruto menos os descontos O
programa deverá pedir ao usuário o valor da sua hora e a quantidade
de horas trabalhadas no mês.
    a. Desconto do IR;
    b. Salário Bruto até R$900,00 (inclusive) – Isento;
    c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
    d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
    e. Salário bruto acima de 2500 – Desconto de 20%
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Informe o Salário Bruto: R$ ");
    double salarioBruto = scanner.nextDouble();

    double descontoIr = 0;
    if (salarioBruto > 2500.00) {
        descontoIr = salarioBruto * 0.20;
    } else if (salarioBruto <= 2500.00 && salarioBruto > 1500.00) {
        descontoIr = salarioBruto * 0.10;
    } else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
        descontoIr = salarioBruto * 0.05;
    }

    double descontoSindicato = salarioBruto * 0.03;
    double valorFgts = salarioBruto * 0.11;
    double salarioLiquido = ( salarioBruto - (descontoIr + descontoSindicato) );

    System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
    System.out.printf("\nDesconto IR: (R$ %.2f)", descontoIr);
    System.out.printf("\nDesconto Sindicato: (R$ %.2f)", descontoSindicato);
    System.out.printf("\nTotal Descontos: (R$ %.2f)", (descontoIr + descontoSindicato) );
    System.out.printf("\nSalário com descontos: R$ %.2f", salarioLiquido);
    System.out.printf("\nFGTS: R$ %.2f", valorFgts);

    scanner.close();
}
}
