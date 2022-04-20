package aula01;

import java.util.Scanner;

public class Ex04 {
/*
Crie um programa que você atribua um valor da idade de uma pessoa e calcule quantos dias aquela pessoa já viveu
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a sua idade: ");
    int idade = scanner.nextInt();

    //considerando todos os anos com 365 dias
    int totalDias = idade * 365;

    System.out.printf("Você já viveu %d dias", totalDias);

    scanner.close();
}
}
