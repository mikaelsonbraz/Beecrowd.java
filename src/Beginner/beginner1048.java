// https://www.beecrowd.com.br/judge/pt/problems/view/1048
package Beginner;
import java.util.Scanner;

public class beginner1048 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario = entrada.nextDouble();
        int porcentagem;
        double aumento;

        if (salario <= 400) {
            porcentagem = 15;
            aumento = salario * 0.15;
        } else if (salario > 400 && salario <= 800) {
            porcentagem = 12;
            aumento = salario * 0.12;
        } else if (salario > 800 && salario <= 1200) {
            porcentagem = 10;
            aumento = salario * 0.1;
        } else if (salario > 1200 && salario <= 2000) {
            porcentagem = 7;
            aumento = salario * 0.07;
        } else {
            porcentagem = 4;
            aumento = salario * 0.04;
        }

        System.out.println("Novo salario: " + String.format("%.2f", (salario + aumento)) +
                "\nReajuste ganho: " + String.format("%.2f", aumento) +
                "\nEm percentual: " + porcentagem + " %");

        }
}
