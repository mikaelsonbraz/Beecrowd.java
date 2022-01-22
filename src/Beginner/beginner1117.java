package Beginner;

import java.util.Scanner;

public class beginner1117 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float nota1 = 0, nota2 = 0;

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
             if (nota2 >= 0 && nota2 <= 10){
                 break;
             } else {
                 System.out.println("nota invalida");
             }
         }

         System.out.println("media = " + String.format("%.2f", (nota1 + nota2) / 2));
    }
}
