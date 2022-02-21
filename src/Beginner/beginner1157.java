package Beginner;

import java.util.Scanner;

public class beginner1157 {

    public static void main(String[] args){

        Scanner entada = new Scanner(System.in);

        int numCasos = entada.nextInt();

        for (int x = 1; x <= numCasos; x++){
            if (numCasos % x == 0){
                System.out.println(x);
            }
        }
    }
}
