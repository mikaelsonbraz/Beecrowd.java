package Beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beginner1176 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        List<Long> listaFibo = new ArrayList<>();
        long primeiro = 0;
        long segundo = 1;
        long controle = 0;
        listaFibo.add(primeiro);
        listaFibo.add(segundo);

        for(int x = 0; x < 59; x++){
            controle = primeiro + segundo;
            listaFibo.add(controle);
            primeiro = segundo;
            segundo = controle;
        }

        int numCasos = entrada.nextInt();

        for (int y = 0; y < numCasos; y++){
            int posicao = entrada.nextInt();
            System.out.println("Fib("+posicao+") = "+listaFibo.get(posicao));
        }
    }
}
