package Beginner;

import java.util.Scanner;

public class beginner1070 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for(int i = num; i <= num + 11; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
