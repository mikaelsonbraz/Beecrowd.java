package Beginner;

import java.util.Scanner;

public class beginner1118 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float nota1 = 0, nota2 = 0;
        int continuar = 1;

        while (continuar != 2) {

            while (true) {
                nota1 = entrada.nextFloat();
                if (nota1 >= 0 && nota1 <= 10) {
                    break;
                } else {
                    System.out.println("nota invalida");
                }
            }
            while (true) {
                nota2 = entrada.nextFloat();
                if (nota2 >= 0 && nota2 <= 10) {
                    break;
                } else {
                    System.out.println("nota invalida");
                }
            }

            System.out.println("media = " + String.format("%.2f", (nota1 + nota2) / 2));

            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                continuar = entrada.nextInt();
            } while (continuar != 1 && continuar != 2);

        }
    }
}

