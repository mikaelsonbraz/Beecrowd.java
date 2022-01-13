// https://www.beecrowd.com.br/judge/en/problems/view/1051
package Beginner;

import java.util.Scanner;

public class beginner1051 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Double salario = entrada.nextDouble();

        System.out.println(calcularImposto(salario));
    }

    public static String calcularImposto(double salario){
        String quantia;
        if (salario <= 2000) {
            quantia = "Isento";
        } else if (salario > 2000 && salario <= 3000) {
            quantia = "R$ " + String.format("%.2f", (salario - 2000) * 0.08);
        } else if (salario > 3000 && salario <= 4500) {
            quantia = "R$ " + String.format("%.2f", 80 + (salario - 3000) * 0.18);
        } else {
            quantia = "R$ " + String.format("%.2f", 350 + (salario - 4500) * 0.28);
        }
        return quantia;
    }
}
