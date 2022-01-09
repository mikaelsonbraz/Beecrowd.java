package Beginner;
import java.util.List;
import java.util.Scanner;

public class beginner1022 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        String[] entrada = ent.nextLine().split(" ");
        int numA = Integer.parseInt(entrada[0]), numB = Integer.parseInt(entrada[1]), numC = Integer.parseInt(entrada[2]), numD = Integer.parseInt(entrada[3]);

        if ((numB > numC) && (numD > numA) && (numC+numD > numA+numB) && (numC > 0) && (numD > 0) && (numA % 2 == 0)){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
