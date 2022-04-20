package aula01;

import java.util.Scanner;

public class Ex15 {
/*
Escreva um programa para calcular a quantidade de ferraduras necessárias para equipar todos os cavalos comprados
para um haras. A informação de cavalos comprados deve ser informada pelo usuário.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de cavlos comprados: ");
    int cavalosComprados = scanner.nextInt();

    System.out.printf("%nA quantidade total de ferraduras é: %d", cavalosComprados * 4);

    scanner.close();
}
}
