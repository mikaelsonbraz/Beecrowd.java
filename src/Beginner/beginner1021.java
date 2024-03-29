// https://www.beecrowd.com.br/judge/en/problems/view/1021
package Beginner;

import java.util.Locale; import java.util.Scanner;

public class beginner1021 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
        double[] moedas = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        int qtdNota, qtdMoeda;

        double valor = sc.nextDouble();
        valor = (valor * 100) + 0.05;

        System.out.println("NOTAS:");
        for (double nota : notas) {
            qtdNota = (int) (valor / (nota * 100));
            valor %= nota * 100;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, nota);
        }

        System.out.println("MOEDAS:");
        for (double moeda : moedas) {
            qtdMoeda = (int) (valor / (moeda * 100));
            valor %= moeda * 100;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moeda);
        }

        sc.close();

    }
}

