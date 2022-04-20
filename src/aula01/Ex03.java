package aula01;

import java.util.Scanner;

public class Ex03 {
/*
Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
    -o valor da variável de quanto a pessoa quer emprestado;
    -em quantos meses ela irá pagar
        A taxa de juros será de 2% ao mês
        Fórmula: M = C * (1+i)^t
            M = valor final após a aplicação dos juros
            C = valor que a pessoa vai pegar emprestado
            i é a taxa de juros
            t é o tempo
    -Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros

 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final double taxaJuros = 0.02;

    System.out.print("Informe o valor empresatado: ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.print("Informe a quantidade de meses para pagar: ");
    int meses = scanner.nextInt();

    double valorFinal = valorEmprestimo * Math.pow(1 + taxaJuros , meses);
    System.out.printf("%nO valor total a ser pago: $ %.2f", valorFinal);


    scanner.close();

}
}
