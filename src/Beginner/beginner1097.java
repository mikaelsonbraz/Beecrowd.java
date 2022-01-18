package Beginner;

public class beginner1097 {

    public static void main(String[] args){

    int i = 1;
    int j = 7;
    int jControle = 4;

        for (int x = 0; x < 15; x++){
        System.out.println("I=" + i + " J=" + j);
        j -= 1;
        if(j == jControle){
            i += 2;
            j += 5;
            jControle += 2;
        }
    }
}
}

