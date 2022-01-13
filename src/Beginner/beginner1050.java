// https://www.beecrowd.com.br/judge/en/problems/view/1050
package Beginner;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class beginner1050 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String ddd = entrada.nextLine();

        Map<String, String> ddds = new HashMap<String, String>();
        ddds.put("61", "Brasilia");
        ddds.put("71", "Salvador");
        ddds.put("11", "Sao Paulo");
        ddds.put("21", "Rio de Janeiro");
        ddds.put("32", "Juiz de Fora");
        ddds.put("19", "Campinas");
        ddds.put("27", "Vitoria");
        ddds.put("31", "Belo Horizonte");

        if (ddds.containsKey(ddd)){
            System.out.println(ddds.get(ddd));
        } else {
            System.out.println("DDD nao cadastrado");
        }

    }
}
