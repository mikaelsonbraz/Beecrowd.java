package Beginner;

import java.util.Scanner;

public class beginner1065 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int pares = 0;

        for(int i = 0; i < 5; i++){
            int num = entrada.nextInt();
            if (num % 2 == 0){
                pares += 1;
            }
        }

        System.out.println(pares + " valores pares");
    }
}
