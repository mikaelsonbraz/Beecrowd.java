package Beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class beginner1175 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int x = 0; x < 20; x++){
            lista.add(entrada.nextInt());
        }

        Collections.reverse(lista);

        for (int item : lista){
            System.out.println("N["+lista.indexOf(item)+"] = "+item);
        }
    }
}
