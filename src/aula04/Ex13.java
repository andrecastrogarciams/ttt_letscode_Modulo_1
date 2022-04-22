package aula04;

import java.util.Scanner;

public class Ex13 {
/*
Um posto está vendendo combustíveis com a seguinte tabela de
descontos:

Álcool
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos e o tipo de
combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule
e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Total de litros: ");
    double litros = scanner.nextDouble();
    scanner.nextLine();
    System.out.printf("Tipo de Combustível G (gasolina) ou A (álcool): ");
    char tipoCombustivel = Character.toUpperCase(scanner.nextLine().charAt(0));

    double alcool = 5.20;
    double gasolina = 7.59;
    double valor = 0.0;

    if (tipoCombustivel == 'A' && litros > 20){
        valor = alcool * litros;
        valor -= alcool * litros * 5 / 100;
    } else if (tipoCombustivel == 'A' && litros <= 20){
        valor = alcool * litros;
        valor -= alcool * litros * 3 / 100;
    } else if (tipoCombustivel == 'G' && litros > 20){
        valor = gasolina * litros;
        valor -= gasolina * litros * 6 / 100;
    } else if (tipoCombustivel == 'G' && litros <= 20){
        valor = gasolina * litros;
        valor -= gasolina * litros * 4 / 100;
    }

    System.out.printf("\nO valor total com desconto: R$ %.2f", valor);



    scanner.close();
}
}
