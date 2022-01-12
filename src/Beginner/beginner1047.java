// https://www.beecrowd.com.br/judge/pt/problems/view/1047
package Beginner;
import java.util.Scanner;

public class beginner1047 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String dados = entrada.nextLine();

        int hora1 = Integer.parseInt(dados.split(" ")[0]);
        int hora2 = Integer.parseInt(dados.split(" ")[2]);
        int minuto1 = Integer.parseInt(dados.split(" ")[1]);
        int minuto2 = Integer.parseInt(dados.split(" ")[3]);

        int duracaoHoras, duracaoMinutos;

        if (hora1 == hora2) {
            if (minuto2 == minuto1){
                duracaoHoras = 24;
                duracaoMinutos = 0;
            } else if (minuto2 > minuto1){
                duracaoHoras = 0;
                duracaoMinutos = minuto2 - minuto1;
            } else {
                duracaoHoras = 23;
                duracaoMinutos = (60 - minuto1) + minuto2;
            }
        } else if (hora2 > hora1){
            if (minuto2 == minuto1) {
                duracaoHoras = hora2 - hora1;
                duracaoMinutos = 0;
            } else if (minuto2 > minuto1){
                duracaoHoras = hora2 - hora1;
                duracaoMinutos = minuto2 - minuto1;
            } else {
                duracaoHoras = hora2 - hora1 - 1;
                duracaoMinutos = (60 - minuto1) + minuto2;
            }
        } else {
            if (minuto2 == minuto1) {
                duracaoHoras = (24 - hora1) + hora2;
                duracaoMinutos = 0;
            } else if (minuto2 > minuto1) {
                duracaoHoras = (24 - hora1) + hora2;
                duracaoMinutos = minuto2 - minuto1;
            } else {
                duracaoHoras = ((24 - hora1) + hora2) - 1;
                duracaoMinutos = (60 - minuto1) + minuto2;
            }
        }

        System.out.println("O JOGO DUROU "+ duracaoHoras +" HORA(S) E "+ duracaoMinutos +" MINUTO(S)");

    }
}
