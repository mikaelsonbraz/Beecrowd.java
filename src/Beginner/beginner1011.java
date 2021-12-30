// https://www.beecrowd.com.br/judge/en/problems/view/1011
package Beginner;

import java.util.Scanner;

public class beginner1011 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        double raio = ent.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3);

        String volumeFormatado = String.format("%.3f", volume);

        System.out.println("VOLUME = " + volumeFormatado);
    }
}
