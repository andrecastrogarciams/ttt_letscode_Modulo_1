package aula02;

import java.util.Scanner;

public class Ex06 {
/*
Leia 4 (quatro) números calcule o quadrado para cada um (n2) some
todos e exiba o resultado
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num1, num2, num3, num4;
    int somaNumeros;
    int somaQuadrados;

    System.out.printf("Digite o primeiro número: ");
    num1 = scanner.nextInt();

    System.out.printf("Digite o segundo número: ");
    num2 = scanner.nextInt();

    System.out.printf("Digite o terceiro número: ");
    num3 = scanner.nextInt();

    System.out.printf("Digite o quarto número: ");
    num4 = scanner.nextInt();

    somaNumeros = num1 + num2 + num3 + num4;
    somaQuadrados = ( num1 * num1 ) + ( num2 * num2 ) + ( num3 * num3 ) + ( num4 * num4 );

    System.out.printf("A soma dos números: %d \nA soma dos quadrados: %d", somaNumeros , somaQuadrados);

    scanner.close();
}
}
