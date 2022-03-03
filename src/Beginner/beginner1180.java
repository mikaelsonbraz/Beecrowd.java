package Beginner;

import java.util.Scanner;

public class beginner1180 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numCasos = entrada.nextInt();

        int menor = entrada.nextInt();
        int posicao = 0;

        for (int x = 1; x < numCasos; x++){
            int numero = entrada.nextInt();
            if (numero <= menor){
                menor = numero;
                posicao = x;
            }
        }

        System.out.println("Menor valor: " + menor +
                "\nPosicao: "+ posicao);

    }
}
