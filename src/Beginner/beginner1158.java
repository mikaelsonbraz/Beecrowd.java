package Beginner;

import java.util.Scanner;

public class beginner1158 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        for (int x = 1; x <= numCasos; x++){

            int numInicio = entrada.nextInt();
            int quantImpares = entrada.nextInt();
            int somaPares = 0;

            if (numInicio % 2 != 0){
                System.out.println((numInicio * quantImpares) + (quantImpares * quantImpares) - quantImpares);
            } else {
                System.out.println(((numInicio + 1) * quantImpares) + (quantImpares * quantImpares) -  quantImpares);
            }
        }
    }
}
