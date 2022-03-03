package Beginner;

import java.util.Scanner;

public class beginner1178 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double numero = entrada.nextDouble();

        for (int x = 0; x < 100; x++){
            System.out.println("N["+x+"] = "+String.format("%.4f", numero));
            numero /= 2;
        }
    }
}
