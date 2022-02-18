package Beginner;

import java.util.Scanner;

public class beginner1151 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();
        String fibo = "0 1 ";
        int zero = 0;
        int um = 1;

        for (int x = 0; x <= numCasos - 3; x++){
            int num = zero + um;
            fibo = fibo.concat(String.valueOf(num) + " ");
            zero = um;
            um = num;
        }

        fibo = fibo.substring(0, fibo.length() - 1);
        System.out.println(fibo);
    }
}
