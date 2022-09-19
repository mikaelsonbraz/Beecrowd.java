// https://www.beecrowd.com.br/judge/en/problems/view/1021
package Beginner;

import java.io.IOException;
import java.util.Scanner;

public class beginner1021 {

    static int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0;
    static int moeda100 = 0, moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1 = 0;

    private static int counterValor(float valor, float dinheiro){
        int counter = 0;
        while (valor >= dinheiro){
            valor -= dinheiro;
            counter += 1;
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {

        Scanner ent = new Scanner(System.in);

        float valor = ent.nextFloat();
        float sobra;

        nota100 = counterValor(valor, 100);
        sobra = valor - (nota100 * 100);
        nota50 = counterValor(sobra, 50);
        sobra = sobra - (nota50 * 50);
        nota20 = counterValor(sobra, 20);
        sobra = sobra - (nota20 * 20);
        nota10 = counterValor(sobra, 10);
        sobra = sobra - (nota10 * 10);
        nota5 = counterValor(sobra, 5);
        sobra = sobra - (nota5 * 5);
        nota2 = counterValor(sobra, 2);
        sobra = sobra - (nota2 * 2);

        moeda100 = counterValor(sobra, 1);
        sobra = sobra - (moeda100);
        moeda50 = counterValor(sobra, 0.5F);
        sobra = (float) (sobra - (moeda50 * 0.5));
        moeda25 = counterValor(sobra, 0.25F);
        sobra = (float) (sobra - (moeda25 * 0.25));
        moeda10 = counterValor(sobra, 0.1F);
        sobra = (float) (sobra - (moeda10 * 0.1));
        moeda5 = counterValor(sobra, 0.05F);
        sobra = (float) (sobra - (moeda5 * 0.05));
        moeda1 = counterValor(sobra, 0.01F);
        sobra = (float) (sobra - (moeda1 * 0.01));


        System.out.println("NOTAS:\n" +
                nota100 + " nota(s) de R$ 100.00\n" +
                nota50 + " nota(s) de R$ 50.00\n" +
                nota20 + " nota(s) de R$ 20.00\n" +
                nota10 + " nota(s) de R$ 10.00\n" +
                nota5 + " nota(s) de R$ 5.00\n" +
                nota2 + " nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                moeda100 + " moeda(s) de R$ 1.00\n" +
                moeda50 + " moeda(s) de R$ 0.50\n" +
                moeda25 + " moeda(s) de R$ 0.25\n" +
                moeda10 + " moeda(s) de R$ 0.10\n" +
                moeda5 + " moeda(s) de R$ 0.05\n" +
                moeda1 + " moeda(s) de R$ 0.01");
    }

}

