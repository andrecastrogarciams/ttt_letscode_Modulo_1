package aula05;

import java.util.Scanner;

public class Ex03 {
/*
Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
○ “Telefonou para a vítima? “
○ “Esteve no local do crime?”
○ “Mora perto da vítima? “
○ “Devia para a vítima? “
○ “Já trabalhou com a vítima? “

● Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como “Suspeita”,
entre 3 e 4 como “Cúmplice” e
5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int respostasPositivas = 0;
    System.out.printf("Respdona S para sim ou N para não.");

    System.out.printf("\nTelefonou para a vítima? ");
    respostasPositivas += (Character.toUpperCase(scanner.nextLine().charAt(0)) == 'S' ? 1 : 0);

    System.out.printf("Esteve no local do crime? ");
    respostasPositivas += (Character.toUpperCase(scanner.nextLine().charAt(0)) == 'S' ? 1 : 0);

    System.out.printf("Mora perto da vítima? ");
    respostasPositivas += (Character.toUpperCase(scanner.nextLine().charAt(0)) == 'S' ? 1 : 0);

    System.out.printf("Devia para a vítima? ");
    respostasPositivas += (Character.toUpperCase(scanner.nextLine().charAt(0)) == 'S' ? 1 : 0);

    System.out.printf("Já trabalhou com a vítima? ");
    respostasPositivas += (Character.toUpperCase(scanner.nextLine().charAt(0)) == 'S' ? 1 : 0);

    if (respostasPositivas == 2){
        System.out.printf("\nSuspeito");
    } else if (respostasPositivas >= 3 && respostasPositivas <= 4){
        System.out.printf("\nCúmplice");
    } else if (respostasPositivas == 5){
        System.out.printf("\nAssassino");
    } else {
        System.out.printf("\nInocente");
    }

    scanner.close();

}
}
