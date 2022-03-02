package Beginner;

import java.util.Scanner;

public class beginner1160 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 0; x < numCasos; x++){
            int anos = 0;
            int populacao1 = entrada.nextInt();
            int populacao2 = entrada.nextInt();
            float crescimento1 = entrada.nextFloat();
            float crescimento2 = entrada.nextFloat();

            while (populacao1 <= populacao2){
                populacao1 += populacao1 * (crescimento1 / 100);
                populacao2 += populacao2 * (crescimento2 / 100);
                anos += 1;
                if (anos > 100){
                    break;
                }
            }

            if (anos <= 100){
                System.out.println(anos + " anos.");
            } else {
                System.out.println("Mais de 1 seculo.");
            }

        }
    }
}
