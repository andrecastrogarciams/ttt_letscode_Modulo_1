package aula03;

import java.util.Scanner;

public class Ex12 {
/*
Escreva um programa que leia e valide as seguintes informações:
● Nome: maior que 3 caracteres;
● Idade: entre 0 e 150
● Salário: maior que 0
● Sexo: ‘f’ ou ‘m’
● Estado civil: ‘s’, ‘c’, ‘v’, ‘d’
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean validado = true;
    String nome = new String();
    int idade;
    double salario;
    char sexo;
    char estadoCivil;

    do{
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        if (nome.length() <= 3){
            System.out.println("Nome Inválido");
        } else {
            validado = false;
        }
    }while (validado);

    validado = true;
    do{
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        if (idade <=0 || idade >= 150 ){
            System.out.println("Idade Inválida");
        } else {
            validado = false;
        }
    }while (validado);

    validado = true;
    do{
        System.out.print("Sexo 'm' ou 'f': ");
        sexo = Character.toLowerCase(scanner.next().charAt(0));
        if (sexo != 'f' && sexo != 'm' ){
            System.out.println("Sexo Inválido");
        } else {
            validado = false;
        }
    }while (validado);

    validado = true;
    do{
        System.out.print("Estado civil 's' , 'c' , 'd' ou 'v': ");
        estadoCivil = Character.toLowerCase(scanner.next().charAt(0));
        if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'd' && estadoCivil != 'v' ){
            System.out.println("Estado Civil Inválido");
        } else {
            validado = false;
        }
    }while (validado);


    scanner.close();
}
}
