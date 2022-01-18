package Beginner;

import java.util.Scanner;

public class beginner1075 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int i = 1; i <= 10000; i++){
            if (i % num == 2){
                System.out.println(i);
            }
        }
    }
}
