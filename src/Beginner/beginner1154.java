package Beginner;

import java.util.Scanner;

public class beginner1154 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int idade, somaIdades = 0, numIdades = 0;

        while (true){
            idade = entrada.nextInt();
            if (idade < 0){
                break;
            } else {
                somaIdades += idade;
                numIdades += 1;
            }
        }

        float media = (float) somaIdades / numIdades;

        System.out.printf("%.2f%n", media);
    }
}
