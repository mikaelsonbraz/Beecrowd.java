package Beginner;

public class beginner1096 {

    public static void main(String[] args){

        int i = 1;
        int j = 7;

        for (int x = 0; x < 15; x++){
            System.out.println("I=" + i + " J=" + j);
            j -= 1;
            if(j == 4){
                i += 2;
                j = 7;
            }
        }
    }
}
