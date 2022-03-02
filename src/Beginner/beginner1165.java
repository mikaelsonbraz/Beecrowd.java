package Beginner;

import java.util.Scanner;

public class beginner1165 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 0; x < numCasos; x++){
            int num = entrada.nextInt();
            int divisores = 0;

            for (int y = 1; y < num; y++){
                if (num % y == 0){
                    divisores += 1;
                }
            }

            if (divisores > 1){
                System.out.println(num + " nao eh primo");
            } else {
                System.out.println(num + " eh primo");
            }
        }
    }
}
