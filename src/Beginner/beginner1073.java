package Beginner;

import java.util.Scanner;

public class beginner1073 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++){
            if(i % 2 == 0 && i != 0){
                System.out.println(i + "^2" + " = " + (i * i));
            }
        }
    }
}
