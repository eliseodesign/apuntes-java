package B_EstructurasDeControl;

import java.util.Scanner;

public class Soluciones_pt1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ## Ejercicio 1

        // Escribe un programa que pida por teclado un día de la semana y que diga qué
        // asignatura toca a primera hora ese día.

        System.out.println("Qué dia de la semana es");
        String day = sc.nextLine(); // metodo

        switch (day) {
            case "Lunes":
                System.out.println("Programación");
                break;

            case "Martes":
                System.out.println("Bases de datos");
                break;
            case "Miercoles":
                System.out.println("Algoritmos");
                break;
            case "Jueves":
                System.out.println("Historia");
                break;

            default:
                System.out.println("Ninguna");
                break;
        }

        System.out.println("---------------- 2");

        // ## Ejercicio 2

        // Realiza un programa que pida una hora por teclado y que muestre luego buenos
        // días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos
        // de
        // 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
        // horas, los minutos no se deben introducir por teclado.
        System.out.println("QUE HORA ES");
        int hora = sc.nextInt();

        String mensaje = "";

        if (hora >= 6 && hora <= 12) {
            mensaje = "Buenos días!!!";
        } else if (hora > 13 && hora < 20) {
            mensaje = "Buenas tardes!!";
        } else {
            mensaje = "Buenas noches...";
        }
        System.out.println(mensaje);

        // omitir el 3 por ser muy simple
        System.out.println("---------------- 4");

        // ## Ejercicio 4

        // Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        // las horas extras. Escribe un programa que calcule el salario semanal de un
        // trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        // trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
        // euros
        // la hora.

        // Ejemplo 1:
        // Por favor, introduzca el número de horas trabajadas durante la semana: 36
        // El sueldo semanal que le corresponde es de 432 euros

        System.out.println("Numero de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        int salario = 0;
        if (horasTrabajadas <= 40) {

            salario = horasTrabajadas * 12;
        }

        if (horasTrabajadas > 40) {
            int extra = horasTrabajadas - 40;
            System.out.println("hora extras: " + extra);

            salario = 40 * 12;
            salario += extra * 16;
        }

        System.out.println(salario);

        System.out.println("---------------- 5");

        // ## Ejercicio 5
        // Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b
        // =
        // 0).
        // Ejemplo 1:
        // Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
        // Por favor, introduzca el valor de a: 2
        // Ahora introduzca el valor de b: 1
        // x = -0.5

        System.out.println("Este programa resuelve ecuaciónes de primer grado");
        System.out.println("Del tipo ax + b = 0");

        System.out.println("Valor de a: ");
        float a = sc.nextFloat();
        System.out.println("Valor de b: ");
        float b = sc.nextFloat();

        float resultado = 0;

        resultado = (-1 * b) / a;

        System.out.println(a + "x" + " + " + b + " = " + "0");
        System.out.println(a + "x" + " = " + b);
        System.out.println("x" + " = " + "b/a");
        System.out.println("x" + " = " + resultado);

        sc.close();
    }
}
