package Beginner;

import java.util.Scanner;

public class beginner1115 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        while (true){
            int x = entrada.nextInt();
            int y = entrada.nextInt();
            if (x == 0 || y == 0){
                break;
            } else {
                if (x > 0){
                    if (y > 0){
                        System.out.println("primeiro");
                    } else {
                        System.out.println("quarto");
                    }
                } else {
                    if (y > 0){
                        System.out.println("segundo");
                    } else {
                        System.out.println("terceiro");
                    }
                }
            }
        }
    }
}
