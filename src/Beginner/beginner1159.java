package Beginner;

import java.util.Scanner;

public class beginner1159 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        while (true){
            int numero = entrada.nextInt();
            int soma = 0;

            if (numero == 0){
                break;
            }

            for (int x = numero; x <= numero + 9; x++){
                if (x % 2 == 0){
                    soma += x;
                }
            }

            System.out.println(soma);
        }
    }
}
