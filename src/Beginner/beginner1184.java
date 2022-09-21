package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class beginner1184 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String operacao = entrada.next().toUpperCase(Locale.ROOT);
        double soma = 0;

        double[][] lista = new double[12][12];

        for (int x = 0; x < 12; x++){
            for (int y = 0; y < 12; y++){
                lista[x][y] = entrada.nextFloat();
                if (x > y){
                    soma += lista[x][y];
                }
            }
        }

        if (operacao.equals("M")) soma /= 66;
        System.out.printf("%.1f%n", (soma));
    }
}
