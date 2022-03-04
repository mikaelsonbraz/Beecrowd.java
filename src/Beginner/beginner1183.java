package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class beginner1183 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String operacao = entrada.next().toUpperCase(Locale.ROOT);
        double soma = 0;

        double[][] lista = new double[12][12];

        for (int x = 0; x < 12; x++){
            for (int y = 0; y < 12; y++){
                lista[x][y] = entrada.nextFloat();
                if (y > x){
                    soma += lista[x][y];
                }
            }
        }

        if (operacao.equals("S")){
            System.out.printf("%.1f%n", soma);
        } else {
            System.out.printf("%.1f%n", (soma / 66));
        }
    }
}
