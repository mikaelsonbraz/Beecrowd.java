// https://www.beecrowd.com.br/judge/en/problems/view/1044
package Beginner;
import java.util.Scanner;

public class beginner1044 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String dados = entrada.nextLine();

        int numero1 = Integer.parseInt(dados.split(" ")[0]);
        int numero2 = Integer.parseInt(dados.split(" ")[1]);

        if (numero2 % numero1 == 0 || numero1 % numero2 == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
