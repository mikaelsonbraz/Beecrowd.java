// https://www.beecrowd.com.br/judge/en/problems/view/1012
package Beginner;
import java.util.Scanner;

public class beginner1013 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);


        String[] numeros = ent.nextLine().split(" ");
        int maiorValor = 0;

        for (String dado : numeros){
            int valorAtual = Integer.parseInt(dado);

            if(valorAtual > maiorValor){
                maiorValor = valorAtual;
            }
        }

        System.out.println(maiorValor + " eh o maior");
    }
}
