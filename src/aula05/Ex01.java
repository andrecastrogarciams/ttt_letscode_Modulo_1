package aula05;

import java.util.Scanner;

public class Ex01 {
/*
Calcular a quantidade de dinheiro gasta por um fumante.
Dados:
    o número de anos que ele fuma,
    o nº de cigarros fumados por dia e
    o preço de uma carteira com 20 cigarros
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Quantidade de anos de fumante: ");
    int anosFumante = scanner.nextInt();

    System.out.printf("Quantidade de cigarros fumados por dia: ");
    int cigarrosDia = scanner.nextInt();

    System.out.printf("Valor da carteira com 20 cigarros: ");
    double valorCarteira  = scanner.nextDouble();

    double totalGasto = anosFumante * 365 * cigarrosDia * valorCarteira / 20;

    System.out.printf("\nConsiderando o valor atual da carteira de cigarros o fumante já gastou ao todo: R$ %.2f", totalGasto);

    scanner.close();
}
}
