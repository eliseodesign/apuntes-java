package A_Basicos;

public class Soluciones {

    public static void main(String[] args) {

        // ## Ejercicio 1
        // Escribe un programa en el que se declaren las variables enteras x e y.
        // Asígnales
        // los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
        // el valor de cada variable, la suma, la resta, la división y la
        // multiplicación.}

        System.out.println("EJERCICIO 1");
        int x, y;
        x = 144;
        y = 999;
        int suma = x + y;
        int resta = x - y;
        int division = x / y;
        int multiplicacion = x * y;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);

        // ## Ejercicio 2

        // Crea la variable nombre y asígnale tu nombre completo. Muestra su valor por
        // pantalla de tal forma que el resultado del programa sea el mismo que en el
        // ejercicio 1 del capítulo 1.
        System.out.println("EJERCICIO 2");

        String nombre = "Eliseo Francisco Arévalo Espinoza";
        System.out.println(nombre);

        // ## Ejercicio 3 - omitido porque es algo simple

        // ## Ejercicio 4

        // Realiza un conversor de dolares a euros. La cantidad en euros que se quiere
        // convertir deberá estar almacenada en una variable.

        System.out.println("EJERCICIO 4");

        double dolares = 10;
        double resultado = dolares * 0.98;

        System.out.println(resultado);

        // ## Ejercicio 6

        // Escribe un programa que calcule el total de una factura a partir de la base
        // imponible (precio sin IVA). La base imponible estará almacenada en una
        // variable.

        System.out.println("EJERCICIO 6");

        Double base = 10.54;

        Double IVA = 0.13;

        resultado = base * IVA;
        System.out.println(resultado);

    }
}
