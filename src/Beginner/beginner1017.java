// https://www.beecrowd.com.br/judge/en/problems/view/1017
package Beginner;
import java.util.Scanner;

public class beginner1017 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        String formatacao = "%.3f";

        double horas = ent.nextInt();
        double velMedia = ent.nextInt();

        double combustivelGasto = (horas * velMedia) / 12;

        System.out.println(String.format(formatacao, combustivelGasto));

    }
}
