package aula01;

import java.util.Scanner;

public class Ex14 {
/*
Escreva um programa para ler o raio de um círculo, calcular e escrever o valor da área:
Cálculo:  área = PI * (raio²)
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o raio do círculo: ");
    double raioCirculo = scanner.nextDouble();

    double areaCirculo =Math.PI * Math.pow(raioCirculo , 2);

    System.out.printf("A área do círculo é = %.2f", areaCirculo);
    scanner.close();
}
}
