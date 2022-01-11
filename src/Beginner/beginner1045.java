// https://www.beecrowd.com.br/judge/pt/problems/view/1045
package Beginner;
import java.util.Arrays;
import java.util.Scanner;

public class beginner1045 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String dados = entrada.nextLine();

        float[] lados = new float[3];

        lados[0] = Float.parseFloat(dados.split(" ")[0]);
        lados[1] = Float.parseFloat(dados.split(" ")[1]);
        lados[2] = Float.parseFloat(dados.split(" ")[2]);

        Arrays.sort(lados);

        float maiorLado = lados[2];
        float meioLado = lados[1];
        float menorLado = lados[0];

        if (maiorLado >= meioLado + menorLado) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(maiorLado, 2) == Math.pow(meioLado, 2) + Math.pow(menorLado, 2)) {
            System.out.println("TRIANGULO RETANGULO");
        } else {
            if (Math.pow(maiorLado, 2) > Math.pow(meioLado, 2) + Math.pow(menorLado, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(maiorLado, 2) < Math.pow(meioLado, 2) + Math.pow(menorLado, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (maiorLado == meioLado && menorLado == maiorLado) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((maiorLado == meioLado && maiorLado != menorLado) || (meioLado == menorLado && meioLado != maiorLado) || (menorLado == maiorLado && menorLado != meioLado)){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
