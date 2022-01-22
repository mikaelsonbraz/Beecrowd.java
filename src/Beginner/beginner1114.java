package Beginner;

import java.util.Scanner;

public class beginner1114 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        while (true){
            String senhaDigitada = entrada.nextLine();

            if (senhaDigitada.equals("2002")){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
