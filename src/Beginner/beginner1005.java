// https://www.beecrowd.com.br/judge/en/problems/view/1005
package Beginner;

import java.util.Scanner;

public class beginner1005 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        double result = (valor1 * 3.5 + valor2 * 7.5) / 11;
        entrada.close();
        String resultado = String.format("%.5f", result);

        System.out.println("MEDIA = " + resultado);
    }
}
