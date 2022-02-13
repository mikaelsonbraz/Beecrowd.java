package Beginner;

import java.util.Scanner;

public class beginner1149 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numA = entrada.nextInt();
        int numN = entrada.nextInt();

        while (numN <= 0){
            numN = entrada.nextInt();
        }

        int soma = 0;

        for (int x = 0; x < numN; x++){
            soma += (numA + x);
        }

        System.out.println(soma);
    }
}
