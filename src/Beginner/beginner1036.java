// https://www.beecrowd.com.br/judge/en/problems/view/1036
package Beginner;
import java.util.Scanner;

public class beginner1036 {

    public static void main(String[] args) {
        double a, b, c;
        String formatacao = "%.5f";
        Scanner entrada = new Scanner(System.in);
        String dados = entrada.nextLine();

        a = Double.parseDouble(dados.split(" ")[0]);
        b = Double.parseDouble(dados.split(" ")[1]);
        c = Double.parseDouble(dados.split(" ")[2]);

        bhaskara(a, b, c, formatacao);

    }

    public static void bhaskara(double a, double b, double c, String format){
        double delta = Math.pow(b, 2) - (4 * a * c);

        double R1 = (-b + Math.sqrt(delta)) / (2 * a);
        double R2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (2 * a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + String.format(format, R1) +
                    "\nR2 = " + String.format(format, R2));
        }
    }


}
