package Beginner;

import java.util.Scanner;

public class beginner1078 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}
