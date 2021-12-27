// https://www.beecrowd.com.br/judge/en/problems/view/1001
package Beginner;
import java.util.Scanner;

public class beginner1001 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numA = entrada.nextInt();
        int numB = entrada.nextInt();

        entrada.close();

        System.out.println("X = " + (numA+numB));
    }
}
