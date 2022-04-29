package aula05;

import java.util.Scanner;

public class Ex04 {
/*
Leia a velocidade máxima permitida em uma avenida e a velocidade
com que o motorista estava dirigindo nela e calcule a multa que uma
pessoa vai receber, sabendo que são pagos:

    a) 50 reais se o motorista estiver ultrapassar em até 10km/h a
    velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a
    60km/h ou a 56km/h);

    b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a
    velocidade permitida.

    c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int multa = 0;
    System.out.printf("Informe a velocidade máxima permitida (km/h): ");
    double velocidadeMaximaVia = scanner.nextDouble();

    System.out.printf("Qual a velocidade do veículo (km/h): ");
    double velocidadeVeiculo = scanner.nextDouble();

    if ( 0 < (velocidadeVeiculo - velocidadeMaximaVia) && (velocidadeVeiculo - velocidadeMaximaVia) <= 10.0){
        multa = 50;
    } else if (  10.0 < (velocidadeVeiculo - velocidadeMaximaVia) && (velocidadeVeiculo - velocidadeMaximaVia) <= 30.0 ){
        multa = 100;
    } else if ( (velocidadeVeiculo - velocidadeMaximaVia) > 30.0){
        multa = 200;
    } else {
        System.out.printf("O veículo estava dentro do limite de velocidade permitida na via!\n");
    }

    System.out.printf("O valor da multa por excesso de velocidade é R$ %d\n", multa);



    scanner.close();
}
}
