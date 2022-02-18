package Beginner;

public class beginner1156 {

    public static void main(String[] args){

            float num = 1;
            int duplica = 2;

            for (int x = 3; x <= 39; x+=2){
            num += (float) x / duplica;
            duplica *= 2;
        }

            System.out.printf("%.2f%n", num);
    }
}

