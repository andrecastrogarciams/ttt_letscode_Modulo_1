package aula03;

import java.util.Scanner;

public class Ex02 {
/*
 Faça um programa que leia um número inteiro diferente de zero e mostre
uma mensagem indicando se este número é positivo ou negativo. Pare a
execução do programa quando o usuário requisitar (O programa deve
parar quando o usuário escolher 0).
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero = 0;

    do {

        System.out.println("Para parar a execução digite 0 (zero).");
        System.out.print("Ou digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Número Positivo");
        } else if (numero < 0){
            System.out.println("Número Negativo");
        }

    } while (numero != 0);

    scanner.close();
}
}
