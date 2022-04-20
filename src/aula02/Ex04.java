package aula02;

import java.util.Scanner;

public class Ex04 {
/*
Um hotel quer fazer um levantamento das praias da cidade para uma
programação turística. Sabendo-se que cada praia tem um nome e uma
distância (em Km) do hotel, escreva um programa que forneça os
seguintes dados:
- O nome da praia mais distante.
- Quantas praias estão a mais de 10km e a menos de 15km.
- A distância média das praias.
// Para cada praia deverá ser informado seu nome e a distância em Km
do hotel.
Você deve receber 5 praias;
Você deve armazenar o nome das 5 praias em um array;
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomePraia = new String[5];
    int[] distanciaPraia = new int[5];

    for (int i = 0 ; i < nomePraia.length ; i++){
        System.out.print("Nome Praia: ");
        nomePraia[i] = scanner.nextLine();

        System.out.print("Distância em Km: ");
        distanciaPraia[i] = scanner.nextInt();
        scanner.nextLine();
    }

    int praiaMaisDistante = 0;
    int praiasMaisDezKm = 0;
    int praisMenosQuinzeKm = 0;
    double mediaDistancia = 0.0;

    for (int i = 0 ; i < distanciaPraia.length ; i++){
        praiaMaisDistante = ( distanciaPraia[i] > distanciaPraia[praiaMaisDistante] ? i : praiaMaisDistante);
        if (distanciaPraia[i] > 10) praiasMaisDezKm++;
        if (distanciaPraia[i] < 15) praisMenosQuinzeKm++;
        mediaDistancia += distanciaPraia[i];
    }

    mediaDistancia = mediaDistancia / nomePraia.length;

    System.out.printf("\nPraia mais distante: %s", nomePraia[praiaMaisDistante]);
    System.out.printf("\nPraias com mais de 10Km: %d", praiasMaisDezKm);
    System.out.printf("\nPraias com menos de 15Km: %d", praisMenosQuinzeKm);
    System.out.printf("\nDistância Média: %.2f", mediaDistancia);

    scanner.close();
}
}
