import java.util.Scanner;

public class Soluciones_2_2_Cuestionario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int puntaje = 0;

        System.out.println("¿Java es un lenguaje orientado a objetos?");
        System.out.println("1: verdadero    2: falso");

        int uno = scan.nextInt();

        if (uno == 1) {
            puntaje += 1;
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
        }

        System.out.println("Entorno de Desarrollo Integrado por sus siglas en ingles:");
        System.out.println("1: EDI      2: IDE      3: Editor");
        int dos = scan.nextInt();
        if (dos == 2) {
            puntaje += 1;
        }

        System.out.println("Tipo de variable para almacenar decimales de gran tamaño");
        System.out.println("1: float      2: decimal      3: double");
        int tres = scan.nextInt();
        if (tres == 3) {
            puntaje += 1;
        }

        System.out.println("---FIN---");
        System.out.println("Tu puntaje fue:" + puntaje + "/3");
    }
}
