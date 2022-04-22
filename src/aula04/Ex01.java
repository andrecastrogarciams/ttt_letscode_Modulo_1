package aula04;

import java.util.Random;

public class Ex01 {
/*
Escreva um código para armazenar 10 valores aleatórios até o número
100 do tipo double em um array;
(Você pode utilizar a biblioteca Random:
https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/ )
 */
public static void main(String[] args) {
    Random random = new Random();
    double numeros[] = new double[10];

    for (int i=0 ; i<10 ; i++){
        numeros[i] = random.nextDouble() * 100;
    }

    for (double numero : numeros){
        System.out.println(numero);
    }

}
}
