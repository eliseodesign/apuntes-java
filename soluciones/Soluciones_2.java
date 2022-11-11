import java.util.Scanner;

public class Soluciones_2 {

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

        if (hora > 6 && hora < 12) {
            mensaje = "Buenos días!!!";
        } else if (hora > 13 && hora < 20) {
            mensaje = "Buenas tardes!!";
        } else {
            mensaje = "Buenas noches...";
        }
        System.out.println(mensaje);

        System.out.println("---------------- 2");

    }
}
