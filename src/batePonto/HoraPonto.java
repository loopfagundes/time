package batePonto;

import java.util.Scanner;

public class HoraPonto {

    public static String input() {
        return new Scanner(System.in).next();
    }

    public static void main(String[] args) {

        System.out.println("ENTRADA");
        System.out.println("Hora e minuto:");
        String manhaEntrada = input();

        System.out.println("INICIO INTERVALO");
        System.out.println("Hora e minuto:");
        String inicioInt = input();

        String durante1 = CalcHours.diffHours(manhaEntrada, inicioInt);
        System.out.println("Trabalhou durante " + durante1 + " horas da manha");

        System.out.println("FIM INTERVALO");
        System.out.println("Hora e minuto:");
        String fimInt = input();

        String diffHora = CalcHours.diffHours(durante1, "08:00");

        String resultFinal = CalcHours.calcHoras(fimInt, diffHora);
        System.out.println("Você sairá do trabalho às " + resultFinal);

        System.out.println("SAIDA");
        System.out.println("Hora e minuto:");
        String saida = input();

        String durante2 = CalcHours.diffHours(fimInt,saida);
        System.out.println("Trabalhou durante " + durante2 + " horas da tarde");

        System.out.println("Total que trabalhou durante " + CalcHours.calcHoras(durante1, durante2) + " horas por dia.");
    }
}