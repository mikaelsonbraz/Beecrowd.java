package Beginner;

import java.util.Scanner;

public class beginner1099 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 0; x < numCasos; x++){
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();
            int maior = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            int somaImpares = 0;
            for (int y = menor + 1; y < maior; y++){
                if (y % 2 != 0){
                    somaImpares += y;
                }
            }
            System.out.println(somaImpares);
        }
    }
}
