package Beginner;

import java.util.Scanner;

public class beginner1064 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int positivos = 0;
        double media = 0;

        for(int i = 0; i < 6; i++){
            double num = entrada.nextDouble();
            if (num > 0){
                positivos += 1;
                media += num;
            }
        }

        System.out.println(positivos + " valores positivos\n" +
                String.format("%.1f", media / positivos));
    }
}
