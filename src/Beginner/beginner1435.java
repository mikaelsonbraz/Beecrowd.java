package Beginner;

import java.util.Arrays;
import java.util.Scanner;

public class beginner1435 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        while (N > 0){

            int[][] matrizTemp = new int[N][N];

            for (int[] ints : matrizTemp) {
                Arrays.fill(ints, 1);
            }

            int value = 1;
            int up = 0;
            int left = 0;
            int down = N - 1;
            int right = N - 1;
            int mid = (N % 2 == 0) ? N / 2 : (N + 1) / 2;

            while (value <= mid){
                int i = left;
                while (i <= right){
                    matrizTemp[up][i] = value;
                    matrizTemp[down][i] = value;
                    i++;
                }

                i = up + 1;
                while (i < down){
                    matrizTemp[i][left] = value;
                    matrizTemp[i][right] = value;
                    i++;
                }

                value++;
                up++;
                down--;
                left++;
                right--;
            }

            for (int i = 0; i < N; i++){
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < N; j++){
                    line.append(String.format(" %3d", matrizTemp[i][j]));
                }
                System.out.println(line.substring(1));
            }
            System.out.println("");

            N = leitor.nextInt();
        }
    }
}
