package B_EstructurasDeControl;

import java.util.Scanner;

public class Soluciones_pt2 {

    public static void main(String[] args) {

        System.out.println("-------------6-------------");
        // ## Ejercicio 6
        // Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
        // una altura h. Aplica la fórmula t =√2h/g siendo g = 9:81m/s2

        Scanner sc = new Scanner(System.in);

        final double G = 9.81f;

        System.out.println("Calcular tiempo de caída");
        System.out.println("Altura:");
        double h = sc.nextDouble();

        double resultado = Math.sqrt(h / G);

        System.out.println("Resultado: " + resultado);

        System.out.println("-------------7-------------");
        // ## Ejercicio 7
        // Escribe un programa que dada una hora determinada (horas y minutos), calcule
        // los segundos que faltan para llegar a la medianoche.

        System.out.println("Introduce la hora");
        int hour = sc.nextInt();
        System.out.println("Introduce los minutos");
        int minute = sc.nextInt();

        int hourRemain = 24 - hour;
        int minuteRemain = hourRemain * 60;

        minuteRemain -= minute;

        int segundos = minuteRemain * 60;
        System.out.println("Segundos restantes: " + segundos);

        System.out.println("-------------8-------------");

        sc.close();
    }
}
