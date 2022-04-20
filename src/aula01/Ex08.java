package aula01;

import java.util.Scanner;

public class Ex08 {
/*
Escreva um programa em java para definir o consumo médio de um automóvel sendo fornecido a distância total
percorrida pelo automóvel e o total de combustível gasto (litros).
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a distância total percorrida em kilometros: ");
    double distanciaTotal = scanner.nextDouble();

    System.out.println("Informe o total de combustivel gasto em litros: ");
    double combustivelTotal = scanner.nextDouble();

    double consumoMedio = distanciaTotal / combustivelTotal;

    System.out.printf("O consumo médio é: %.2f km/l", consumoMedio);
    scanner.close();
}
}
