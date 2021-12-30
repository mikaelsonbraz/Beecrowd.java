// https://www.beecrowd.com.br/judge/en/problems/view/1009
package Beginner;

import java.util.Scanner;

public class beginner1009 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String nome = ent.next();
        float salario = ent.nextFloat();
        float vendas = ent.nextFloat();
        double salTotal = salario + vendas * 0.15;
        String total = String.format("%.2f", salTotal);


        System.out.println("TOTAL = R$ " + total);
    }
}
