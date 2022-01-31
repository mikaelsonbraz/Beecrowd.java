package Beginner;

import java.util.Scanner;

public class beginner1133 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        int maiorNum = Math.max(num1, num2);
        int menorNum = Math.min(num1, num2);

        for (int x = menorNum + 1; x < maiorNum; x++){
            if (x % 5 == 2 || x % 5 == 3){
                System.out.println(x);
            }
        }
    }
}
