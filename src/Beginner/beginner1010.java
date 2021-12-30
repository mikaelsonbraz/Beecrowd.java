// https://www.beecrowd.com.br/judge/en/problems/view/1010
package Beginner;

import java.util.Scanner;

public class beginner1010 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String pecas1 = ent.nextLine();
        String pecas2 = ent.nextLine();

        String[] listPecas1 = pecas1.split(" ");
        String[] listPecas2 = pecas2.split(" ");


        int qntPecas1 = Integer.parseInt(listPecas1[1]);
        double valorPecas1 = Double.parseDouble(listPecas1[2]);

        int qntPecas2 = Integer.parseInt(listPecas2[1]);
        double valorPecas2 = Double.parseDouble(listPecas2[2]);

        double valorTotal = (qntPecas1 * valorPecas1) + (qntPecas2 * valorPecas2);

        String valor = String.format("%.2f", valorTotal);

        System.out.println("VALOR A PAGAR: R$ " + valor);

    }
}
