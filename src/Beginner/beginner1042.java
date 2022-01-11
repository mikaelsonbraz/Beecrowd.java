// https://www.beecrowd.com.br/judge/en/problems/view/1042
package Beginner;

import java.util.*;

public class beginner1042 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String listaString = entrada.nextLine();
        int[] listaNum = new int[3];

        listaNum[0] = Integer.parseInt(listaString.split(" ")[0]);
        listaNum[1] = Integer.parseInt(listaString.split(" ")[1]);
        listaNum[2] = Integer.parseInt(listaString.split(" ")[2]);

        Arrays.sort(listaNum);

        for (int item : listaNum) {
            System.out.println(item);
        }

        System.out.println();

        for (String item : listaString.split(" ")) {
            System.out.println(item);
        }

    }
}
