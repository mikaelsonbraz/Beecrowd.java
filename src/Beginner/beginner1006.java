// https://www.beecrowd.com.br/judge/en/problems/view/1006
package Beginner;
import java.util.Scanner;

public class beginner1006 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double notaA = entrada.nextDouble() * 2;
        double notaB = entrada.nextDouble() * 3;
        double notaC = entrada.nextDouble() * 5;
        double result = (notaA + notaB + notaC) / 10;

        String resultado = String.format("%.1f", result);

        System.out.println("MEDIA = " + resultado);
    }
}
