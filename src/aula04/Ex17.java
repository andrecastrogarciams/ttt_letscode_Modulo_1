package aula04;

import java.util.Scanner;

public class Ex17 {
/*
A prefeitura de uma cidade deseja fazer uma pesquisa entre seus
habitantes.
Faça um algoritmos para coletar dados sobre o salário e
número de filhos de cada habitante e após as leituras, escrever:

a. Média de salário da população
b. Média do número de filhos
c. Maior salário dos habitantes
d. Percentual de pessoas com salário menor que R$ 150,00

Obs: O final da leitura dos dados se dará com a entrada de um “salário
negativo”.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double[] salario = new Double[5];
    Integer[] filhos = new Integer[5];
    boolean sair = true;
    int i = 0;
    do{
        System.out.printf("#%d Salário: ", (i+1));
        double salarioTemporario = scanner.nextDouble();
        sair = (salarioTemporario < 0 ? false : true);
        if (sair) {

            salario[i] = salarioTemporario;
            System.out.printf("#%d Filhos: ", (i + 1));
            filhos[i] = scanner.nextInt();
            i++;

            if (i % 5 == 0) {
                Double[] novoSalario = new Double[i+5];
                Integer[] novoFilhos = new Integer[i+5];
                for (int j = 0; j < salario.length; j++) {
                    novoSalario[j] = salario[j];
                    novoFilhos[j] = filhos[j];
                }
                salario = novoSalario;
                filhos = novoFilhos;
            }

        }
    }while (sair);

    i=0;
    double somaSalario = 0;
    double somaFilho = 0;
    double maiorSalario = salario[0];
    int totalSalarioMenor150 = 0;
    do{
        somaSalario += salario[i];
        somaFilho += filhos[i];
        maiorSalario = (maiorSalario < salario[i] ? salario[i] : maiorSalario);
        totalSalarioMenor150 += (salario[i] < 150 ? 1 : 0);
        i++;
    }while (salario[i] != null);

    double mediaSalario = somaSalario / i;
    System.out.printf("\nMedia Salario: R$ %.2f", mediaSalario );

    double mediaNumeroFilhos = somaFilho / i;
    System.out.printf("\nMedia Número de Filhos: %.2f", mediaNumeroFilhos);

    System.out.printf("\nMaior Salário: R$ %.2f", maiorSalario);

    double percentualAbaixo150 = totalSalarioMenor150 / (double)i * 100;
    System.out.printf("\nO percentual de pessoas com salário abaixo de R$ 150,00: %.2f",percentualAbaixo150);
    System.out.print("%");

}
}
