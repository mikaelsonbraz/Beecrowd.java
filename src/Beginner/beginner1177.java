package Beginner;

import java.util.Scanner;

public class beginner1177 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int controle = 0;

        for (int x = 0; x < 1000; x++){
            if (controle == numero){
                controle = 0;
            }
            System.out.println("N["+x+"] = "+ controle);
            controle += 1;
        }
    }
}
