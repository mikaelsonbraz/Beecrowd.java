package Beginner;

import java.util.Scanner;

public class beginner1131 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int jogos = 0, gremio = 0, inter = 0, vitGremio = 0, vitInter = 0, empate = 0, continuar = 1;

        while (continuar != 2) {
            inter = entrada.nextInt();
            gremio = entrada.nextInt();
            if (inter > gremio) {
                vitInter += 1;
            } else if (gremio > inter){
                vitGremio += 1;
            } else {
                empate += 1;
            }
            jogos += 1;
            System.out.println("Novo grenal (1-sim 2-nao)");
            continuar = entrada.nextInt();
        }

        System.out.println(jogos + " grenais" +
                "\nInter:" + vitInter +
                "\nGremio:" + vitGremio +
                "\nEmpates:" + empate);

        if (vitInter > vitGremio){
            System.out.println("Inter venceu mais");
        } else if (vitGremio > vitInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
