public class Soluciones_3 {

    public static void main(String[] args) {
        System.out.println("----------1----------");
        // ## Ejercicio 1
        // Muestra los números múltiplos de 5 de 0 a 25 utilizando un bucle for.

        for (var i = 0; i <= 25; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("----------2----------");

        // ## Ejercicio 2
        // Muestra los números múltiplos de 5 de 0 a 25 utilizando un bucle while.

        int i = 1;
        while (i <= 25) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

            ++i;
        }

        System.out.println("----------3----------");
        // ## Ejercicio 3
        // Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while

        int a = 1;
        do {
            if (a % 5 == 0) {
                System.out.println(a);
            }

            a++;
        } while (a <= 25);

        System.out.println("----------4----------");
        // ## Ejercicio 4
        // Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
        // utilizando
        // un bucle for.

        for (var b = 320; b > 160; b -= 20) {
            System.out.println(b);
        }

        System.out.println("----------5----------");

        // ## Ejercicio 5
        // Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
        // utilizando
        // un bucle while.

        int c = 320;

        while (c > 160) {
            System.out.println(c);
            c -= 20;
        }

    }
}