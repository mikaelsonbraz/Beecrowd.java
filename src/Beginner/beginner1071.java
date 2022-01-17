package Beginner;

import java.util.Scanner;

public class beginner1071 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int numMaior = Math.max(num1, num2);
        int numMenor = Math.min(num1, num2);
        int somaImpares = 0;

        for (int i = numMenor + 1; i < numMaior; i++){
            if (i % 2 != 0){
                somaImpares += i;
            }
        }

        System.out.println(somaImpares);

    }
}
