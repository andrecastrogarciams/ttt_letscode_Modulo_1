package aula04;

import java.util.Scanner;

public class Ex10 {
/*
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número
de notas possíveis (cédulas) onde o valor pode ser decomposto. As
notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
Na sequência mostra o valor lido e a relação de notas necessárias.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Informe um número inteiro: ");
    int valor = scanner.nextInt();

    int nota100 = 0;
    int nota50 = 0;
    int nota20 = 0;
    int nota10 = 0;
    int nota5 = 0;
    int nota2 = 0;
    int nota1 = 0;
    int valorTotal = valor;

    do{
        if (valorTotal >= 100) {
            nota100++;
            valorTotal -= 100;
        } else if (valorTotal >= 50){
            nota50++;
            valorTotal -= 50;
        } else if (valorTotal >= 20){
            nota20++;
            valorTotal -= 20;
        } else if (valorTotal >= 10){
            nota10++;
            valorTotal -= 10;
        } else if (valorTotal >= 5) {
            nota5++;
            valorTotal -= 5;
        } else if (valorTotal >= 2) {
            nota2++;
            valorTotal -= 2;
        } else if (valorTotal >= 1){
             nota1++;
             valorTotal -= 1;
        }
    }while (valorTotal > 0);

    System.out.printf("\nValor lido = %d" , valor);
    if (nota100 > 0){
        System.out.printf("\nNota 100 = %d", nota100);
    }
    if (nota50 > 0){
        System.out.printf("\nNota 50 = %d", nota50);
    }
    if (nota20 > 0){
        System.out.printf("\nNota 20 = %d", nota20);
    }
    if (nota10 > 0){
        System.out.printf("\nNota 10 = %d", nota10);
    }
    if (nota5 > 0){
        System.out.printf("\nNota 5 = %d", nota5);
    }
    if (nota2 > 0){
        System.out.printf("\nNota 2 = %d", nota2);
    }
    if (nota1 > 0){
        System.out.printf("\nNota 1 = %d", nota1);
    }
    scanner.close();
}
}
