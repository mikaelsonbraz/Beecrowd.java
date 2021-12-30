// https://www.beecrowd.com.br/judge/en/problems/view/1007
package Beginner;

import java.util.Scanner;

public class beginner1007 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int valorA = entrada.nextInt();
        int valorB = entrada.nextInt();
        int valorC = entrada.nextInt();
        int valorD = entrada.nextInt();
        int diferenca = valorA * valorB - valorC * valorD;

        System.out.println("DIFERENCA = " + diferenca);
    }
}
