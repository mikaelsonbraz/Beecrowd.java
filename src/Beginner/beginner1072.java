package Beginner;

import java.util.Scanner;

public class beginner1072 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();
        int inIntervalo = 0;
        int outIntervalo = 0;

        for (int i = 0; i < numCasos; i++){
            int dado = entrada.nextInt();
            if (dado >= 10 && dado <= 20){
                inIntervalo += 1;
            } else {
                outIntervalo += 1;
            }
        }

        System.out.println(inIntervalo + " in\n" +
                outIntervalo + " out");
    }
}
