package aula04;

import java.util.Scanner;

public class Ex12 {
/*
Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma
empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total
das vendas até R$1.500,00 mais 5% sobre o que ultrapassar este valor,
calcular e escrever o seu salário total.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Informe o salário fixo: ");
    double salarioFixo = scanner.nextDouble();

    System.out.printf("Informe o valor total das vendas: ");
    double valorTotalVenda = scanner.nextDouble();

    double salarioTotal = 0.0;
    if (valorTotalVenda > 1500.00){
        salarioTotal = (1500.00 * 3 / 100) + ( (valorTotalVenda - 1500.00) * 5 / 100);
        salarioTotal += salarioFixo;
    } else {
        salarioTotal = valorTotalVenda * 3 / 100;
        salarioTotal += salarioFixo;
    }

    System.out.printf("\nO Sálario total = R$ %.2f", salarioTotal);

    scanner.close();
}
}
