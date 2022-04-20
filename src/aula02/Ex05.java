package aula02;

import java.util.Scanner;

public class Ex05 {
/*
Escreva um programa para calcular a quantidade de litros de
combustível necessária para se fazer uma viagem, sabendo-se que o carro
faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a
velocidade média.
utilizar as seguintes fórmulas:
distância = tempo x velocidade
litros usados = distância / 12
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Tempo gasto em horas: ");
    double tempoGasto = scanner.nextDouble();

    System.out.printf("Velocidade média em Km/h: ");
    double velocidadeMedia = scanner.nextDouble();

    double distancia = tempoGasto * velocidadeMedia;
    double litrosUsados = distancia / 12.0;

    System.out.printf("\nDistância: %.2f Km - Combustível: %.2f litros", distancia , litrosUsados);

    scanner.close();
}
}
