package Beginner;

import java.util.Scanner;

public class beginner1021 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        double valor = ent.nextDouble();

        int nota100 = 0, nota50 = 0, nota20 = 0, nota10 = 0, nota5= 0, nota2 = 0;
        int moeda100 = 0, moeda50 = 0, moeda25 = 0, moeda10 = 0, moeda5 = 0, moeda1 = 0;

        while (valor >= 0.01){
            if (valor >= 100){
                valor -= 100;
                nota100 += 1;
            } else if (valor >= 50){
                valor -= 50;
                nota50 += 1;
            } else if (valor >= 20){
                valor -= 20;
                nota20 += 1;
            } else if (valor >= 10){
                valor -= 10;
                nota10 += 1;
            } else if (valor >= 5){
                valor -= 5;
                nota5 += 1;
            } else if (valor >= 2){
                valor -= 2;
                nota2 += 1;
            } else if (valor >= 1){
                valor -= 1;
                moeda100 += 1;
            } else if (valor >= 0.5){
                valor -= 0.5;
                moeda50 += 1;
            } else if (valor >= 0.25){
                valor -= 0.25;
                moeda25 += 1;
            } else if (valor >= 0.1){
                valor -= 0.1;
                moeda10 += 1;
            } else if (valor >= 0.05){
                valor -= 0.05;
                moeda5 += 1;
            } else {
                valor -= 0.01;
                moeda1 += 1;
            }
        }

        System.out.println("NOTAS:\n" +
                nota100 + " nota(s) de R$ 100.00\n" +
                nota50 + " nota(s) de R$ 50.00\n" +
                nota20 + " nota(s) de R$ 20.00\n" +
                nota10 + " nota(s) de R$ 10.00\n" +
                nota5 + " nota(s) de R$ 5.00\n" +
                nota2 + " nota(s) de R$ 2.00\n" +
                "MOEDAS:\n" +
                moeda100 + " moeda(s) de R$ 1.00\n" +
                moeda50 + " moeda(s) de R$ 0.50\n" +
                moeda25 + " moeda(s) de R$ 0.25\n" +
                moeda10 + " moeda(s) de R$ 0.10\n" +
                moeda5 + " moeda(s) de R$ 0.05\n" +
                moeda1 + " moeda(s) de R$ 0.01");
    }
}
