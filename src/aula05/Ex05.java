package aula05;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
/*
Crie uma agenda que armazena, código da pessoa, número do telefone,
idade. Sua agenda deve possibilitar:
(1) – inserir um contato
(2) – Remover um contato
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean sair = true;
    Integer[] codigoContato = new Integer[100];
    String[] telefoneContato = new String[100];
    int indice = 0;
    do{
        int totalContatos = 0;
        for(int i=0; i<codigoContato.length; i++){
            if (codigoContato[i] == null){
                break;
            } else {
                totalContatos++;
            }
        }
        System.out.println("Quantidade de Contatos na Agenda: " + totalContatos);
        System.out.println("Escolha uma Opção:");
        System.out.println("(0) - Sair da Agenda");
        System.out.println("(1) - Inserir um Contato");
        System.out.println("(2) - Remover um Contato");
        System.out.println("(3) - Mostrar Agenda");

        int opcao = scanner.nextInt();
        switch (opcao){
            case 0:
                sair = false;
                break;
            case 1:
                if (indice >= 99){
                    System.out.println("Agenda Cheia!");
                    break;
                } else {
                    System.out.printf("Informe o Código do contato: ");
                    codigoContato[indice] = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("Informe o telefone do contato: ");
                    telefoneContato[indice] = scanner.nextLine();
                    indice++;
                    break;
                }

            case 2:
                System.out.printf("Informe o código do contato para ser removido: ");
                int codigoRemover = scanner.nextInt();
                for(int i=0; i<codigoContato.length; i++){
                    if (codigoContato[i] != null && codigoContato[i] == codigoRemover){
                        codigoContato[i] = null;
                        telefoneContato[i] = null;
                        indice--;
                        break;
                    } else if (codigoContato[i] == null){
                        System.out.printf("\n*** Contato não encontrado! ***\n");
                        break;
                    }
                }
                for(int i=0; i<codigoContato.length-1; i++){
                    if (codigoContato[i] == null && codigoContato[i+1] != null){
                        codigoContato[i] = codigoContato[i+1];
                        codigoContato[i+1] = null;
                        telefoneContato[i] = telefoneContato[i+1];
                        telefoneContato[i+1] = null;
                    } if (codigoContato[i] == null && codigoContato[i+1] == null){
                        break;
                    }
                }
                break;

            case 3:
                System.out.println("********** AGENDA **********");
                for(int i=0; i<codigoContato.length-1; i++){
                    if(codigoContato[i] == null){
                        break;
                    } else {
                        System.out.printf("Código: %d  - Telefone: %s\n", codigoContato[i], telefoneContato[i]);
                    }
                }
                System.out.println("****************************");
                break;

            default:
                break;
        }


    }while(sair);

    scanner.close();
}
}
