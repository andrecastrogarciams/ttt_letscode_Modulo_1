package aula04;

import java.util.Scanner;

public class Ex15 {
/*
Uma loja está levantando o valor total de todas as mercadorias em
estoque. Escreva um algoritmo que permita a entrada das seguintes
informações:
    a. a quantidade de produtos que irá cadastrar
    b. para cada produto:
        o nome do produto
        o número total de mercadorias no estoque;
        o valor unitário da mercadoria.
    c. Imprimir o valor total em estoque e a média de valor das mercadorias.
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Informe a quantidade de produtos que irá cadastrar: ");
    int quantidadeProdutos = scanner.nextInt();

    String[] produtoNome = new String[quantidadeProdutos];
    int[] produtoEstoque = new int[quantidadeProdutos];
    double[] produtoValorUnitario = new double[quantidadeProdutos];

    for (int i=0 ; i<quantidadeProdutos ; i++){
        scanner.nextLine();
        System.out.printf("Produto #%d - Nome: ", (i+1));
        produtoNome[i] = scanner.nextLine();

        System.out.printf("Produto #%d - Total Estoque: ", (i+1));
        produtoEstoque[i] = scanner.nextInt();

        System.out.printf("Produto #%d - Valor Unitário: ", (i+1));
        produtoValorUnitario[i] = scanner.nextDouble();
    }

    System.out.printf("\n\n");
    double valorTotalEstoque = 0.0;
    int quantidadeTotalEstoque = 0;
    for (int i=0 ; i<quantidadeProdutos ; i++){
        valorTotalEstoque += produtoEstoque[i] * produtoValorUnitario[i];
        quantidadeTotalEstoque += produtoEstoque[i];
    }

    double mediaValorTotal = valorTotalEstoque / quantidadeTotalEstoque;

    System.out.printf("\nO valor total em estoque: R$ %.2f", valorTotalEstoque);
    System.out.printf("\nA média de valor das mercadorias: R$ %.2f", mediaValorTotal);

    scanner.close();
}
}
