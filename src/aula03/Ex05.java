package aula03;

import java.util.Scanner;

public class Ex05 {
/*
Escreva um programa que receba o peso e a altura de uma pessoa e
calcule o seu IMC, o resultado irá dizer se a pessoa está: abaixo do peso
(IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9), com excesso de
peso (IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um
deles com uma mensagem.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o peso (Kg): ");
    double peso = scanner.nextDouble();

    System.out.print("Informe a altura (m): ");
    double altura = scanner.nextDouble();

    double imc = (peso / (altura * altura));

    System.out.printf("IMC: %.1f - ",imc);
    if ( imc < 18.5 ) {
        System.out.println("Abaixo do Peso");
    } else if ( imc < 25 ){
        System.out.println("Peso Normal");
    } else if ( imc < 30 ) {
        System.out.println("Excesso de Peso");
    } else {
        System.out.println("Obesidade");
    }


    scanner.close();
}
}
