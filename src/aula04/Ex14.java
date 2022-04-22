package aula04;

import java.util.Scanner;

public class Ex14 {
/*
Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres
(considere que as idades dos homens serão sempre diferentes entre si,
bem como as das mulheres).

Calcule e escreva a soma das idades do homem mais velho com a
mulher mais nova, e o produto das idades do homem mais novo com a
mulher mais velha.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Informe a idade da primeira mulher: ");
    int idadeMulher01 = scanner.nextInt();

    System.out.printf("Informe a idade da segunda mulher: ");
    int idadeMulher02 = scanner.nextInt();

    System.out.printf("Informe a idade do primeiro homem: ");
    int idadeHomem01 = scanner.nextInt();

    System.out.printf("Informe a idade do segundo homem: ");
    int idadeHomem02 = scanner.nextInt();

    int somaIdades = (idadeHomem01 > idadeHomem02 ? idadeHomem01 : idadeHomem02);
    somaIdades += (idadeMulher01 < idadeMulher02 ? idadeMulher01 : idadeMulher02);

    int produtoIdades = (idadeHomem01 < idadeHomem02 ? idadeHomem01 : idadeHomem02);
    produtoIdades *= (idadeMulher01 > idadeMulher02 ? idadeMulher01 : idadeMulher02);

    System.out.printf("Soma da idade do homem mais velho com a mulher mais nova: %d\n", somaIdades);
    System.out.printf("Produto da idade do homem mais novo com a mulher mais velha: %d\n", produtoIdades);


    scanner.close();
}
}
