package Beginner;

public class beginner1155 {


    public static void main(String[] args){

        float num = 1;

        for (int x = 2; x <= 100; x++){
            num += (float) 1 / x;
        }

        System.out.printf("%.2f%n", num);
    }
}
