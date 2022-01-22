package Beginner;

import java.util.Scanner;

public class beginner1113 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        while (true) {

            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();

            if (num1 < num2) {
                System.out.println("Crescente");
            } else if (num1 > num2) {
                System.out.println("Decrescente");
            } else {
                break;
            }
        }
    }
}
