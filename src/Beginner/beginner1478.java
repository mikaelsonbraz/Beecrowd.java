package Beginner;

import java.util.Scanner;

public class beginner1478 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        while (N > 0){

            for (int i = 1; i <= N; i++) {
                int[] line = new int[N];
                for (int j = 0; j < N; j++){
                    line[j] = i+j;
                }
                StringBuilder linha = new StringBuilder();
                for (int num : organizer(line)){
                    linha.append(String.format(" %3d", num));
                }
                System.out.println(linha.substring(1));
            }
            System.out.println();

            N = leitor.nextInt();
        }
    }

    private static int[] organizer(int[] nuns){
        int[] organized = new int[nuns.length];
        int inicial = nuns[0];
        int begin = 0;
        int continuar = 2;
        while (inicial >= 1){
            organized[begin] = inicial;
            begin++;
            inicial--;
        }
        for(int i = 0; i < organized.length; i++){
            if (organized[i] == 0){
                organized[i] = continuar;
                continuar++;
            }
        }
        return organized;
    }
}