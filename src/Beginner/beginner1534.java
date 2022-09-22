package Beginner;

import java.util.Scanner;

public class beginner1534 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        while (true){
            try{
                int[][] list = new int[N][N];

                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if (i + j + 1 == N){
                            list[i][j] = 2;
                        } else if (i == j){
                            list[i][j] = 1;
                        } else {
                            list[i][j] = 3;
                        }
                    }
                }

                for (int[] ints : list){
                    StringBuilder output = new StringBuilder();
                    for (int k : ints){
                        output.append(k);
                    }
                    System.out.println(output);
                }

                N = leitor.nextInt();
            } catch (Exception e) {
                break;
            }
        }
    }
}
