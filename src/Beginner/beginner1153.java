package Beginner;

import java.util.Scanner;

public class beginner1153 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numFatorial = entrada.nextInt();
        int resultado = numFatorial;


        for (int x = 1; x < numFatorial; x++){
            resultado *= numFatorial - x;
        }

        System.out.println(resultado);

    }
}
