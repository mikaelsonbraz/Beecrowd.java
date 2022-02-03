package Beginner;

import java.util.Scanner;

public class beginner1134 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int gas = 0, alcool = 0, diesel = 0, num = 0;

        while (num != 4){

            switch (num = entrada.nextInt()){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gas += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO" +
                "\nAlcool: " + alcool +
                "\nGasolina: " + gas +
                "\nDiesel: " + diesel);
    }
}
