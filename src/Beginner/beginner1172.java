package Beginner;

import java.util.Scanner;

public class beginner1172 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        for(int x = 0; x < 10; x++){
            int num = entrada.nextInt();
            int numero = (num > 0) ? num : 1;
            System.out.println("X[" + x + "] = " + numero);
        }
    }
}
