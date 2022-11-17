# Bucle Do While

El bucle do-while funciona de la misma manera que el bucle while, con la diferencia que la expresion se evalúa al final de la iteración. Las sentencias que encierran el bucle
do-while, por tanto, se ejecutan como mínimo una vez. La sintaxis es la siguiente:

```java
do {
sentencias
} while (expresion)
```

El siguiente ejemplo es el equivalente do-while a los dos ejemplos anteriores que
cuentan del 1 al 10.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i < 11);
```

Bucle do-while que termina cuando se introduce por teclado un número impar.

```java
do {
        System.out.print("Dime un número: ");
        numero = Integer.parseInt(System.console().readLine());
    if (numero % 2 == 0) { // comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
    } else {
        System.out.println("No me gustan los números impares, adiós.");
    }
} while (numero % 2 == 0);
```
