package Beginner;

import java.io.IOException;

import java.util.Scanner;

public class beginner1189 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);

        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {

                if (i > j && i + j <= 10) soma += M[i][j];

            }
        }

        if (O == 'M') soma /= 30;
        System.out.printf("%.1f%n", soma);
    }

}

