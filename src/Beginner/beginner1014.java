package Beginner;
import java.text.NumberFormat;
import java.util.Scanner;

public class beginner1014 {

    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        String formatacao = "%.3f";


        int distancia = ent.nextInt();
        double combustivelGasto = ent.nextDouble();
        double autonomia = distancia / combustivelGasto;

        System.out.println(String.format(formatacao, autonomia) + " km/l");
    }
}
