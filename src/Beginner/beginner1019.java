// https://www.beecrowd.com.br/judge/en/problems/view/1019
package Beginner;
import java.util.Scanner;

public class beginner1019 {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int tempo = ent.nextInt();

        int horas = 0, minutos = 0, segundos = 0;

        while (tempo > 0) {
            if (tempo >= 3600) {
                tempo -= 3600;
                horas += 1;
            } else if (tempo >= 60) {
                tempo -= 60;
                minutos += 1;
            } else {
                segundos += tempo;
                tempo = 0;
            }
        }

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
