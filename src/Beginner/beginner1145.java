package Beginner;

import java.util.*;

public class beginner1145 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numColunas = entrada.nextInt();
        int numCasos = entrada.nextInt();

        String linha = "";

        for (int x = 1; x < numCasos; x += numColunas) {
            for (int y = x; y < x + numColunas; y++) {
                if (y != x + numColunas - 1){
                    linha = linha.concat(y + " ");
                } else {
                    linha = linha.concat(y + "");
                }

            }
            System.out.println(linha);
            linha = "";
        }

    }
}
