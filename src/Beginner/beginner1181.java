package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class beginner1181 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int linha = entrada.nextInt();
        String operacao = entrada.next().toUpperCase(Locale.ROOT);
        float soma = 0;

        float[][] lista = new float[12][12];

        for (int x = 0; x < 12; x++){
            for (int y = 0; y < 12; y++){
                lista[x][y] = entrada.nextFloat();
                if (x == linha){
                    soma += lista[x][y];
                }
            }
        }

        if (operacao.equals("S")){
            System.out.println(String.format("%.1f", soma));
        } else {
            System.out.println(String.format("%.1f", (soma / 12)));
        }
    }
}
