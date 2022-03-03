package Beginner;

import java.util.Scanner;

public class beginner1173 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int x = 0; x < 10; x++){
            System.out.println("N["+x+"] = "+numero);
            numero *= 2;
        }
    }
}
