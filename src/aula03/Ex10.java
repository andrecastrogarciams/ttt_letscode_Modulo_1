package aula03;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
/*
Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e
peça que o usuário informe o número correto, você deve dar dicas caso o
palpite esteja errado, informando se o número correto é maior ou menor
do que o informado, caso ele erre três vezes o programa se encerra e
imprime uma mensagem informando que ele perdeu.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int numero = random.nextInt(10)+1;
    boolean acertou = true;
    int erros = 0;
    int numeroChute;

    do{
        System.out.print("Digite um número de 1 a 10: ");
        numeroChute = scanner.nextInt();
        if (numeroChute < numero) {
            erros++;
            System.out.println("O número correto é maior do que o informado");
        } else if (numeroChute > numero) {
            erros++;
            System.out.println("O número correto é menor do que o informado");
        } else {
            System.out.println("Parabéns você acertou o número");
            acertou = false;
        }
        if (erros == 3) {
            System.out.println("Que pena, você perdeu.");
        }
    }while (acertou && erros < 3);

    scanner.close();
}
}
