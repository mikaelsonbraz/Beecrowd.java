package Beginner;

import java.util.Scanner;

public class beginner1132 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int maiorNum = Math.max(num1, num2);
        int menorNum = Math.min(num1, num2);
        int soma = 0;

        for (int x = menorNum; x <= maiorNum; x++){
            if (x % 13 != 0){
                soma += x;
            }
        }

        System.out.println(soma);

    }
}
