package Beginner;

import java.util.Scanner;

public class beginner1144 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 1; x <= numCasos; x++){
            System.out.println(x + " " + String.format("%.0f", Math.pow(x, 2)) + " " + String.format("%.0f", Math.pow(x, 3)));
            System.out.println(x + " " + String.format("%.0f", (Math.pow(x, 2) + 1)) + " " + String.format("%.0f", (Math.pow(x, 3) + 1)));
        }
    }
}
