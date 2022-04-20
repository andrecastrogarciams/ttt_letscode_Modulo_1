package aula02;

import java.util.Scanner;

public class Ex02 {
/*
Elabore um programa que escreve seu nome completo na
primeira linha, seu endereço na segunda, e o CEP e telefone na
terceira.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("\nNome completo: ");
    String nomeCompleto = scanner.nextLine();

    System.out.printf("\nEndereço: ");
    String endereco = scanner.nextLine();

    System.out.printf("\nCEP: ");
    String cep = scanner.nextLine();

    System.out.printf("\nTelefone: ");
    String telefone = scanner.nextLine();

    System.out.printf("\nNome: %s \nEndereço %s \nCEP: %s  Tel: %s", nomeCompleto , endereco , cep , telefone );

    scanner.close();
}
}
