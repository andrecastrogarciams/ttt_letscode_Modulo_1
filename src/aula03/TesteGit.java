package aula03;

import java.util.Scanner;

public class TesteGit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};


        for (int i = 0 ; i < matriz.length ; i++){
            for (int numero : matriz[i]){
                System.out.println(numero);
            }
        }
        scanner.close();

    }
}
