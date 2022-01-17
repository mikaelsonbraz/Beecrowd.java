package Beginner;

import java.util.Scanner;

public class beginner1066 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++){
            int inteiro = entrada.nextInt();
            if (inteiro % 2 == 0){
                pares += 1;
                if (inteiro > 0) {
                    positivos += 1;
                }
                if (inteiro < 0){
                    negativos += 1;
                }
            } else {
                impares += 1;
                if (inteiro > 0) {
                    positivos += 1;
                }
                if (inteiro < 0){
                    negativos += 1;
                }
            }
        }

        System.out.println(pares + " valor(es) par(es)\n" +
                impares + " valor(es) impar(es)\n" +
                positivos + " valor(es) positivo(s)\n" +
                negativos + " valor(es) negativo(s)");
    }
}
