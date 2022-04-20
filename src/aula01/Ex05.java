package aula01;

import java.util.Scanner;

public class Ex05 {
/*
Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7% e mostra o valor antes do reajuste e após.

 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o salário atual: ");
    double salarioAtual = scanner.nextDouble();
    double reajuste = 0.07;
    double novoSalario = salarioAtual + (salarioAtual * reajuste);

    System.out.printf("Salário antes do reajuste: %.2f%nSalário após reajuste: %.2f", salarioAtual, novoSalario);

    scanner.close();
}
}
