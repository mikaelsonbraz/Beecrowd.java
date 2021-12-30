// https://www.beecrowd.com.br/judge/en/problems/view/1007
package Beginner;

import java.util.Scanner;

public class beginner1008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorHora = entrada.nextDouble();

        String salario = String.format("%.2f", valorHora * horasTrabalhadas);

        System.out.println("NUMBER = " + numero +
                "\nSALARY = U$ " + salario);
    }
}
