package Beginner;

import java.util.*;

public class beginner1179 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int x = 0; x < 15; x++){
            int numero = entrada.nextInt();

            if (numero % 2 == 0){
                pares.add(numero);
                if (pares.size() == 5){
                    for (int y = 0; y < 5; y++){
                        System.out.println("par["+y+"] = "+pares.get(y));
                    }
                    Collections.fill(pares, null);
                }
            } else {
                impares.add(numero);
                if (impares.size() == 5){
                    for (int y = 0; y < 5; y++){
                        System.out.println("impar["+y+"] = "+impares.get(y));
                    }
                    Collections.fill(impares, null);
                }
            }
        }
        impares.removeIf(Objects::isNull);
        pares.removeIf(Objects::isNull);
        for (int z = 0; z < impares.size(); z++){
            System.out.println("impar["+z+"] = "+impares.get(z));
        }

        for (int z = 0; z < pares.size(); z++){
            System.out.println("par["+z+"] = "+pares.get(z));
        }
    }
}
