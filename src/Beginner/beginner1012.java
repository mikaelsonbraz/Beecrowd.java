// https://www.beecrowd.com.br/judge/en/problems/view/1012
package Beginner;
import java.util.Scanner;

public class beginner1012 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String formatacao = "%.3f";

        String[] medidas = ent.nextLine().split(" ");

        double medidaA = Double.parseDouble(medidas[0]);
        double medidaB = Double.parseDouble(medidas[1]);
        double medidaC = Double.parseDouble(medidas[2]);

        double areaTriangulo = (medidaA * medidaC) / 2;
        double areaCirculo = 3.14159 * Math.pow(medidaC, 2);
        double areaTrapezio = ((medidaA + medidaB) * medidaC) / 2;
        double areaQuadrado = Math.pow(medidaB, 2);
        double areaRetangulo = medidaA * medidaB;

        System.out.println("TRIANGULO: " + String.format(formatacao, areaTriangulo) +
                "\nCIRCULO: " + String.format(formatacao, areaCirculo) +
                "\nTRAPEZIO: " + String.format(formatacao, areaTrapezio) +
                "\nQUADRADO: " + String.format(formatacao, areaQuadrado) +
                "\nRETANGULO: " + String.format(formatacao, areaRetangulo));

    }
}
