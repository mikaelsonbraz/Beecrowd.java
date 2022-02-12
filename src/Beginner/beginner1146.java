package Beginner;

import java.util.Scanner;

public class beginner1146 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numColunas = entrada.nextInt();
        String numeros = "";

        while (numColunas != 0){
            for (int x = 1; x <= numColunas; x++){
                if (x == numColunas){
                    numeros = numeros.concat(x + "");
                } else {
                    numeros = numeros.concat(x + " ");
                }
            }
            System.out.println(numeros);
            numColunas = entrada.nextInt();
            numeros = "";
        }
    }
}
