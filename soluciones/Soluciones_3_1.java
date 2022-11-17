public class Soluciones_3_1 {

    public static void main(String[] args) {

        // ## Ejercicio 7
        // Muestra la tabla de multiplicar de un número introducido por teclado.

        System.out.println("Igresa numero para crear tabla: ");
        int numero = Integer.parseInt(System.console().readLine());

        for (var x = 0; x <= 10; x++) {
            System.out.println(numero + " x " + x + " = " + (numero * x));
        }
    }
}
