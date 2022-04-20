package aula01;

import java.util.Scanner;

public class Ex02 {
    /*
    Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma altura
    de “h” em “t” segundos.
        Considere cavalos = (m * h / t ) / 745,6999
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a massa em Kilogramas: ");
        double massa = scanner.nextDouble();

        System.out.println("Informe a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Informe o tempo em segundos: ");
        int segundos = scanner.nextInt();

        double cavalos = ( massa * altura / segundos) / 745.6999;

        System.out.printf("A quantidade de cavalos necessário é: %.4f", cavalos);

        scanner.close();
    }
}
