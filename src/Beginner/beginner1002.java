// https://www.beecrowd.com.br/judge/en/problems/view/1002
package Beginner;
import java.util.Scanner;

public class beginner1002 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double pi = 3.14159;
        double raio = entrada.nextDouble();

        String resultado = String.format("%.4f", pi * (raio * raio));
        resultado = resultado.replace(",", ".");

        entrada.close();

        System.out.println("A=" + resultado);
    }
}
