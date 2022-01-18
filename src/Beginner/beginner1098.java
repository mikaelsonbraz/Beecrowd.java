package Beginner;

public class beginner1098 {

    public static void main(String[] args) {

        double i = 0;
        double j = 1;

        for (int x = 0; x <= 10; x++){
            for (int y = 0; y < 3; y++){
                if (i == 0 || i == 1 || i > 1.8){
                    System.out.println("I=" + String.format("%.0f", i) + " J=" + String.format("%.0f", j));
                } else {
                    System.out.println("I=" + String.format("%.1f", i) + " J=" + String.format("%.1f", j));
                }
                j += 1;
            }
            i += 0.2;
            j = 1 + i;
        }
    }
}

