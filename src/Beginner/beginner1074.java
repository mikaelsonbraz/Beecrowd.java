package Beginner;

import java.util.Scanner;

public class beginner1074 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int casos = entrada.nextInt();

        for(int i = 0; i < casos; i++){
            int num = entrada.nextInt();
            if (num == 0){
                System.out.println("NULL");
            } else {
                String parOuImpar = (num % 2 == 0) ? "EVEN" : "ODD";
                String posiOuNega = (num > 0) ? "POSITIVE" : "NEGATIVE";
                System.out.println(parOuImpar + " " + posiOuNega);
            }
        }
    }
}
