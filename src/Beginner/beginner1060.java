// https://www.beecrowd.com.br/judge/en/problems/view/1060
package Beginner;

import java.util.Scanner;

public class beginner1060 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int positivos = 0;

        for (int i = 1; i <= 6; i++){
            double num = entrada.nextDouble();
            if (num > 0){
                positivos += 1;
            }
        }

        System.out.println(positivos + " valores positivos");
    }
}
