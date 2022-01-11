// https://www.beecrowd.com.br/judge/pt/problems/view/1046
package Beginner;
import java.util.Scanner;

public class beginner1046 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String horas = entrada.nextLine();

        int hora1 = Integer.parseInt(horas.split(" ")[0]);
        int hora2 = Integer.parseInt(horas.split(" ")[1]);

        if (hora2 > hora1) {
            System.out.println("O JOGO DUROU " + (hora2 - hora1) + " HORA(S)");
        } else if (hora1 == hora2) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + ((24 - hora1) + hora2) + " HORA(S)");
        }

    }
}
