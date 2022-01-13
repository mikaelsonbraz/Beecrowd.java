// https://www.beecrowd.com.br/judge/en/problems/view/1052
package Beginner;

import java.util.Scanner;

public class beginner1052 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Integer mes = entrada.nextInt();

        String[] meses = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println(meses[mes - 1]);
    }
}
