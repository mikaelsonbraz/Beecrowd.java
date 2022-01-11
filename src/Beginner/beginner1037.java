// https://www.beecrowd.com.br/judge/en/problems/view/1037
package Beginner;
import java.util.Scanner;

public class beginner1037 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double dado = entrada.nextDouble();

        if (0 <= dado && dado <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (25 < dado && dado <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (50 < dado && dado <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (75 < dado && dado <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

    }
}
