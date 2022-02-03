package Beginner;

import java.util.Scanner;

public class beginner1142 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();
        int num = 0;

        for(int x = 0; x < numCasos; x++){
            System.out.println((num + 1) + " " + (num + 2) + " " + (num + 3) + " PUM");
            num += 4;
        }
    }
}
