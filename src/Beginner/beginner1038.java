// https://www.beecrowd.com.br/judge/en/problems/view/1038
package Beginner;
import java.util.Scanner;

public class beginner1038 {

    public static void main(String[] args){

        double[] lista = new double[6];
        String formatacao = "%.2f";
        Scanner entrada = new Scanner(System.in);

        String opcaoEQuant = entrada.nextLine();
        int opcao = Integer.parseInt(opcaoEQuant.split(" ")[0]);
        int quant = Integer.parseInt(opcaoEQuant.split(" ")[1]);

        lista[1] = 4.0;
        lista[2] = 4.5;
        lista[3] = 5;
        lista[4] = 2;
        lista[5] = 1.5;

        System.out.println("Total: R$ " + String.format(formatacao, lista[opcao] * quant));

    }
}
