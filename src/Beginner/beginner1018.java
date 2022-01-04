// https://www.beecrowd.com.br/judge/en/problems/view/1018
package Beginner;
import java.util.Scanner;

public class beginner1018 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        int dinheiro = ent.nextInt();

        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

        while (dinheiro > 0){
            if (dinheiro >= 100){
                dinheiro -= 100;
                nota100 += 1;
            } else if (dinheiro >= 50) {
                dinheiro -= 50;
                nota50 += 1;
            } else if (dinheiro >= 20) {
                dinheiro -= 20;
                nota20 += 1;
            } else if (dinheiro >= 10) {
                dinheiro -= 10;
                nota10 += 1;
            } else if (dinheiro >= 5) {
                dinheiro -= 5;
                nota5 += 1;
            } else if (dinheiro >= 2) {
                dinheiro -= 2;
                nota2 += 1;
            } else {
                dinheiro -= 1;
                nota1 += 1;
            }
        }

        System.out.println((nota100 * 100 + nota50 * 50 + nota20 * 20 + nota10 * 10 + nota5 * 5 + nota2 * 2 + nota1) + "\n" +
                nota100 + " nota(s) de R$ 100,00\n" +
                nota50 + " nota(s) de R$ 50,00\n" +
                nota20 + " nota(s) de R$ 20,00\n" +
                nota10 + " nota(s) de R$ 10,00\n" +
                nota5 + " nota(s) de R$ 5,00\n" +
                nota2 + " nota(s) de R$ 2,00\n" +
                nota1 + " nota(s) de R$ 1,00");
    }
}
