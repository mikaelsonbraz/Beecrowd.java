package Beginner;

import java.util.Objects;
import java.util.Scanner;

public class beginner1094 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numCasos = entrada.nextInt();

        int numAnimais = 0;
        int numCoelhos = 0;
        int numRatos = 0;
        int numSapos = 0;

        float perCoelho, perRato, perSapo;

        for (int i = 0; i < numCasos; i++) {
            int numero = entrada.nextInt();
            String animal = entrada.nextLine();
            numAnimais += numero;
            switch (animal){
                case " C":
                    numCoelhos += numero;
                    break;
                case " R":
                    numRatos += numero;
                    break;
                case " S":
                    numSapos += numero;
                    break;
            }

        }

        perCoelho = (float) (numCoelhos * 100) / numAnimais;
        perRato = (float) (numRatos * 100) / numAnimais;
        perSapo = (float) (numSapos * 100) / numAnimais;

        System.out.println("Total: " + numAnimais + " cobaias");
        System.out.println("Total de coelhos: " + numCoelhos);
        System.out.println("Total de ratos: " + numRatos);
        System.out.println("Total de sapos: " + numSapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", perCoelho) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", perRato) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", perSapo) + " %");


    }
}
