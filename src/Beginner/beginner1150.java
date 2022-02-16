package Beginner;

import java.util.Scanner;

public class beginner1150 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int valorX = entrada.nextInt();
        int valorZ = 0;
        int casos = 1;
        int soma = valorX;

        while (valorZ <= valorX){
            valorZ = entrada.nextInt();
        }

        for (int x = valorX + 1; x <= valorZ; x++) {
            soma += x;
            casos += 1;
            if (soma > valorZ) {
                break;
            }
        }

        System.out.println(casos);
    }
}
