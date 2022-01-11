// https://www.beecrowd.com.br/judge/en/problems/view/1041
package Beginner;

import java.util.Scanner;

public class beginner1041 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String dados = entrada.nextLine();

        float pontoX = Float.parseFloat(dados.split(" ")[0]);
        float pontoY = Float.parseFloat(dados.split(" ")[1]);

        if (pontoX == 0 && pontoY == 0) {
            System.out.println("Origem");
        } else if (pontoX == 0) {
            System.out.println("Eixo Y");
        } else if (pontoY == 0) {
            System.out.println("Eixo X");
        } else if (pontoX > 0 && pontoY > 0){
            System.out.println("Q1");
        } else if (pontoX < 0 && pontoY > 0) {
            System.out.println("Q2");
        } else if (pontoX < 0 && pontoY < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }
}
