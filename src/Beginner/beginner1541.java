package Beginner;

import java.util.Scanner;

public class beginner1541 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int ladoA, ladoB, porcentagem, resultado;

        while (true){
            try {
                ladoA = leitor.nextInt();
                ladoB = leitor.nextInt();
                porcentagem = leitor.nextInt();

                if(ladoA == 0 || ladoB == 0 || porcentagem == 0){
                    break;
                }

                resultado = (int) Math.pow(((ladoA * ladoB) * 100) / porcentagem, 0.5);
                System.out.println(resultado);
            } catch (Exception e) {
                break;
            }
        }
    }
}
