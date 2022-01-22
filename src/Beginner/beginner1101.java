package Beginner;

import java.util.Scanner;

public class beginner1101 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        while (true){

            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();
            int[] nums = new int[]{Math.min(num1, num2), Math.max(num1, num2)};
            if (nums[0] <= 0){
                break;
            }

            String numeros = "";
            int soma = 0;

            for (int x = nums[0]; x <= nums[1]; x++){
                numeros += x + " ";
                soma += x;
            }

            System.out.println(numeros + "Sum=" + soma);
        }
    }
}
