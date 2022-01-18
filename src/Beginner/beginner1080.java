package Beginner;

import java.util.Scanner;

public class beginner1080 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int maiorNum = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++){
            int numero = entrada.nextInt();
            if (numero > maiorNum){
                maiorNum = numero;
                posicao = i + 1;
            }
        }

        System.out.println(maiorNum + "\n" + (posicao));
    }
}
