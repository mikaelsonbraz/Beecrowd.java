package Beginner;

import java.util.Scanner;

public class beginner1164 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 0; x < numCasos; x++){
            int num = entrada.nextInt();
            int somaDivisores = 0;

            for (int y = 1; y < num; y++){
                if(num % y == 0){
                    somaDivisores += y;
                }
            }

            if(somaDivisores == num){
                System.out.println(num + " eh perfeito");
            } else {
                System.out.println(num + " nao eh perfeito");
            }

        }
    }
}
