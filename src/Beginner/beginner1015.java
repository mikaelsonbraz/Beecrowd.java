// https://www.beecrowd.com.br/judge/en/problems/view/1015
package Beginner;
import java.util.Scanner;

public class beginner1015 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        String formatacao = "%.4f";

        String[] pontos1 = ent.nextLine().split(" ");
        String[] pontos2 = ent.nextLine().split(" ");

        Double x1 = Double.parseDouble(pontos1[0]);
        Double x2 = Double.parseDouble(pontos2[0]);
        Double y1 = Double.parseDouble(pontos1[1]);
        Double y2 = Double.parseDouble(pontos2[1]);

        Double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(String.format(formatacao, distancia));

    }
}
