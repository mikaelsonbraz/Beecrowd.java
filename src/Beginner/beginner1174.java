package Beginner;

import java.util.Scanner;

public class beginner1174 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        for (int x = 0; x < 100; x++){
            float numero = entrada.nextFloat();
            if (numero <= 10){
                System.out.println("A["+x+"] = "+String.format("%.1f", numero));
            }
        }
    }
}
