package Beginner;

import java.util.Scanner;

public class beginner1116 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 0; x < numCasos; x++){
            float num1 = entrada.nextFloat();
            float num2 = entrada.nextFloat();
            if (num2 == 0){
                System.out.println("divisao impossivel");
            } else {
                System.out.println(String.format("%.1f", (num1 / num2)));
            }
        }
    }
}
