package Beginner;

import java.util.Scanner;

public class beginner1061 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String dia1 = entrada.nextLine().split(" ")[1];
        String tempoInicio = entrada.nextLine();
        String dia2 = entrada.nextLine().split(" ")[1];
        String tempoTermino = entrada.nextLine();

        int[] informacaoDia1 = new int[]{Integer.parseInt(dia1), horaMinutoSegundo(tempoInicio)[0], horaMinutoSegundo(tempoInicio)[1], horaMinutoSegundo(tempoInicio)[2]};
        int[] informacaoDia2 = new int[]{Integer.parseInt(dia2), horaMinutoSegundo(tempoTermino)[0], horaMinutoSegundo(tempoTermino)[1], horaMinutoSegundo(tempoTermino)[2]};

        int[] tempo = tempoEvento(informacaoDia1, informacaoDia2);
        int dias = tempo[0];
        int horas = tempo[1];
        int minutos = tempo[2];
        int segundos = tempo[3];

        System.out.println(dias + " dia(s)\n" +
                horas + " hora(s)\n" +
                minutos + " minuto(s)\n" +
                segundos + " segundo(s)");

    }

    public static int[] horaMinutoSegundo(String horario) {
        int[] listaHorario = new int[3];
        listaHorario[0] = Integer.parseInt(horario.split(" : ")[0]);
        listaHorario[1] = Integer.parseInt(horario.split(" : ")[1]);
        listaHorario[2] = Integer.parseInt(horario.split(" : ")[2]);
        return listaHorario;
    }

    public static int[] tempoEvento(int[] listaInicio, int[] listaFim){
        int[] tempo = new int[4];
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        dias += listaFim[0] - listaInicio[0];

        if (listaFim[1] >= listaInicio[1]){
            horas += listaFim[1] - listaInicio[1];
        } else {
            horas += (24 - listaInicio[1]) + listaFim[1];
            dias -= 1;
        }

        if (listaFim[2] >= listaInicio[2]){
            minutos += listaFim[2] - listaInicio[2];
        } else {
            minutos += (60 - listaInicio[2]) + listaFim[2];
            horas -= 1;
        }

        if (listaFim[3] >= listaInicio[3]){
            segundos = listaFim[3] - listaInicio[3];
        } else {
            segundos = (60 - listaInicio[3]) + listaFim[3];
            minutos -= 1;
        }

        if (minutos < 0){
            minutos = 59;
            horas -= 1;
        }

        if (horas < 0){
            horas = 23;
            dias -= 1;
        }


        tempo[0] = dias;
        tempo[1] = horas;
        tempo[2] = minutos;
        tempo[3] = segundos;

        return tempo;
    }

}
