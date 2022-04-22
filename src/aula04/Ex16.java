package aula04;

import java.util.Locale;
import java.util.Scanner;

public class Ex16 {
/*
Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e
armazenar os nomes lidos em um vetor. Após isto, o algoritmo deve
permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever
a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos
anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[10];

    for (int i=0 ; i<nomes.length ; i++){
        System.out.printf("Nome #%d: ", (i+1));
        nomes[i] = scanner.nextLine();
    }


    System.out.printf("\nDigite um nome para pesquisar: ");
    String nomeBusca = scanner.nextLine();

    boolean encontrei = false;

    for (int i=0 ; i<nomes.length ; i++){
        if (nomeBusca.equalsIgnoreCase(nomes[i])) {
            System.out.printf("\nACHEI");
            encontrei = true;
            break;
        }
    }
    if (!encontrei){
        System.out.printf("\nNÃO ACHEI");
    }

    scanner.close();
}
}
